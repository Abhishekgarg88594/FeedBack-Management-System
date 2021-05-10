package com.cg.fms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.fms.model.ProgramModel;
import com.cg.fms.service.IProgramMaintenance;

@RestController
@RequestMapping(path="/program")
public class ProgramController {

	@Autowired
	private IProgramMaintenance programService;

	/*
	 * to retrieve all program
	 * return : List<program>
	 * params : NIL
	 */
	
	@GetMapping
	public ResponseEntity<List<ProgramModel>> getAllProgram(){
		return new ResponseEntity<>(programService.getAll(), HttpStatus.OK);
	}
	
	/*
	 * to add a program
	 * return : program
	 * params : NIL
	 */

	@PostMapping
	public ResponseEntity<ProgramModel> addProgram(@RequestBody ProgramModel program) throws Exception {
		program = programService.addProgram(program);
		return new ResponseEntity<>(program, HttpStatus.CREATED);
	}

	@PutMapping("/{trainingId}")
	public ResponseEntity<ProgramModel> updateProgramDuration(@PathVariable("trainingId") Long Trainingid,
			@RequestBody @Valid ProgramModel program, 
			BindingResult result) throws Exception {
		return ResponseEntity.ok((programService.update(Trainingid , program)));
	}


	/*
	 * to retrieve a program
	 * return : program
	 * params : course Id
	 */
	
	@GetMapping("/{trainingId}")
	public ResponseEntity<ProgramModel> findProgram(@PathVariable("trainingId") Long id) throws Exception {
		ResponseEntity<ProgramModel> response = null;
		ProgramModel program = programService.getById(id);
		if (program == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(program, HttpStatus.OK);
		}
		return response;
	}
}
