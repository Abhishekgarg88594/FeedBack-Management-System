package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.model.FeedbackProgramModel;
import com.cg.fms.exception.FMSException;

@Service
public interface IFeedbackProgramService {
	FeedbackProgramModel addFeedbackProgram(FeedbackProgramModel fd) throws FMSException;
	FeedbackProgramModel updateFeedbackProgram(String progId , FeedbackProgramModel fd) throws  FMSException;
	FeedbackProgramModel viewProgramFeedback(String trainerId) throws  FMSException;
	List<FeedbackProgramModel> viewAllFeedback() throws  FMSException;

}
