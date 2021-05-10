package com.cg.fms.service;

import java.util.List;

import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.model.FeedbackProgramModel;
import com.cg.fms.repository.FeedbackProgramRepo;
import com.cg.fms.exception.FMSException;

@Service
public class IFeedbackProgramServiceImpl implements IFeedbackProgramService {

	@Autowired
	FeedbackProgramRepo fp;

	@Autowired
	private EMParser parser;

	/*
	 * service implementation for add feedback Program
	 */
	
	@Transactional
	@Override
	public FeedbackProgramModel addFeedbackProgram(FeedbackProgramModel fd) throws FMSException {
		if (fd != null)

			fd = parser.parse(fp.save(parser.parse(fd)));

		return fd;}
	
	/*
	 * service implementation for update Feedback Program
	 */
	
	@Transactional
	@Override
	public FeedbackProgramModel updateFeedbackProgram(String progId, FeedbackProgramModel fd) throws FMSException {
		if (fd!= null) {
			if (!fp.existsById(progId)) {
				throw new FMSException("No Such Feedback");
			}

			fd = parser.parse(fp.save(parser.parse(fd)));
		}

		return fd;
	}

	/*
	 * service implementation for view program feedback
	 */
	
	@Override
	public FeedbackProgramModel viewProgramFeedback(String trainerId) throws FMSException {
		return parser.parse(fp.findById(trainerId).orElse(null));
	}
	
	/*
	 * service implementation for view all feedbacks
	 */
	
	@Override
	public List<FeedbackProgramModel> viewAllFeedback() throws FMSException {
		return fp.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}

}
