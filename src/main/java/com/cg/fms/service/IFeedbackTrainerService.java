package com.cg.fms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.model.FeedbackTrainerModel;
import com.cg.fms.exception.FMSException;


@Service
public interface IFeedbackTrainerService {
	FeedbackTrainerModel addFeedbackProgram(FeedbackTrainerModel fd) throws FMSException;
	FeedbackTrainerModel updateFeedbackProgram(String progId , FeedbackTrainerModel fd) throws  FMSException;
	FeedbackTrainerModel viewProgramFeedback(String trainerId) throws  FMSException;
	List<FeedbackTrainerModel> viewAllFeedback() throws  FMSException;

}
