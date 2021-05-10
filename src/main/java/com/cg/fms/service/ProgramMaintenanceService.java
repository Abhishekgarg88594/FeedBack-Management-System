package com.cg.fms.service;


import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.model.ProgramModel;
import com.cg.fms.repository.ProgramRepo;

@Service
public class ProgramMaintenanceService implements IProgramMaintenance{

	@Autowired
	private ProgramRepo programRepo;

	@Autowired
	private EMParser parser;

	public ProgramMaintenanceService() {

	}

	public ProgramMaintenanceService(ProgramRepo programRepo) {
		super();
		this.programRepo = programRepo;
		this.parser = new EMParser();
	}

	@Override
	@Transactional
	public ProgramModel addProgram(ProgramModel program) throws Exception {
		if(program != null) {
			if(programRepo.existsById(program.getTrainingId())) {
				throw new Exception(" with this Id already exists");
			}

			program = parser.parse(programRepo.save(parser.parse(program)));
		}

		return program;
	}

	@Transactional
	@Override
	public boolean deleteProgram(long trainingId) throws Exception {
		if(!programRepo.existsById(trainingId))
			throw new Exception(" program with this Id does not exists");
		programRepo.deleteById(trainingId);

		return true;
	}

	@Override
	public ProgramModel getById(long i) throws Exception {
		if(!programRepo.existsById(i))
			throw new Exception("No program found with this Id");

		return parser.parse(programRepo.findById(i).get());
	}

	@Override
	public List<ProgramModel> getAll() {
		return programRepo.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}

	@Override
	public ProgramModel update(Long trainingid2, ProgramModel program) throws Exception {
		if (program!= null) {
			if (!programRepo.existsById(trainingid2)) {
				throw new Exception("No Such Feedback");
			}

			program = parser.parse((programRepo.save(parser.parse(program))));
		}

		return program;
	}

}
