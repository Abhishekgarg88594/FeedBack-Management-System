package com.cg.fms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.entity.Course;
import com.cg.fms.entity.Employee;
import com.cg.fms.entity.FeedbackProgramEntity;
import com.cg.fms.entity.FeedbackTrainerEntity;
import com.cg.fms.entity.Program;
import com.cg.fms.model.CourseModel;
import com.cg.fms.model.EmployeeModel;
import com.cg.fms.model.FeedbackProgramModel;
import com.cg.fms.model.FeedbackTrainerModel;
import com.cg.fms.model.ProgramModel;
import com.cg.fms.repository.CourseRepo;
import com.cg.fms.repository.FeedbackProgramRepo;

@Service
public class EMParser {

	@Autowired
	private CourseRepo courseRepo;

	@Autowired
	private  FeedbackProgramRepo feedbackprogRepo;


	public CourseModel parse(Course source) {
		return source==null?null:
			new CourseModel(source.getCourseId(),
					source.getCourseName(), 
					source.getCourseDescription(), 
					source.getNoOfDays());
	}

	public Course parse(CourseModel source) {
		return source==null?null:
			new Course(source.getCourseId(),
					source.getCourseName(), 
					source.getCourseDescription(), 
					source.getNoOfDays());
	}


	public ProgramModel parse(Program source) {
		return source==null?null:
			new ProgramModel(source.getTrainingId(),
					source.getStartDate(),
					source.getEndDate(),
					source.getCourse().getCourseId(),
					source.getFeedback().getProgramId());
	}


	public Program parse(ProgramModel source) {
		return source==null?null:
			new Program(source.getTrainingId(),
					source.getStartDate(), 
					source.getEndDate(),
					courseRepo.findById(source.getCourse()).orElse(null),
					feedbackprogRepo.findById(source.getFeedback()).orElse(null));
	}

	public EmployeeModel parse(Employee source) {
		return source==null?null:
			new EmployeeModel(source.getEmployeeId(), 
					source.getEmployeeName(),  
					source.getEmployeePassword(),
					source.getEmployeeRole(),
					source.getEmpSkill());
	}

	public Employee parse(EmployeeModel source) {
		return source==null?null:
			new Employee(source.getEmployeeId(),
					source.getEmployeeName(),
					source.getEmployeePassword(),
					source.getEmployeeRole(),
					source.getEmpSkill());
	}


	public FeedbackTrainerEntity parse(FeedbackTrainerModel source) {
		return source==null?null:
			new FeedbackTrainerEntity(source.getTrainerId(), source.getFeedbackCriteria1(), source.getFeedbackCriteria2(), source.getFeedbackCriteria3(),
					source.getFeedbackCriteria4(), source.getFeedbackCriteria5(), source.getComments(), source.getSuggestions()); 
	}


	public FeedbackTrainerModel parse(FeedbackTrainerEntity source) {
		return source==null?null:
			new FeedbackTrainerModel(source.getTrainerId(), source.getFeedbackCriteria1(), source.getFeedbackCriteria2(), source.getFeedbackCriteria3(),
					source.getFeedbackCriteria4(), source.getFeedbackCriteria5(), source.getComments(), source.getSuggestions()); 
	}




	public FeedbackProgramEntity parse(FeedbackProgramModel source) {
		return source==null?null:
			new FeedbackProgramEntity(source.getProgramId(), source.getFeedbackCriteria1(), source.getFeedbackCriteria2(), source.getFeedbackCriteria3(),
					source.getFeedbackCriteria4(), source.getFeedbackCriteria5(), source.getComments(), source.getSuggestions());
	}


	public FeedbackProgramModel parse(FeedbackProgramEntity source) {
		return source==null?null:
			new FeedbackProgramModel(source.getProgramId(), source.getFeedbackCriteria1(), source.getFeedbackCriteria2(), source.getFeedbackCriteria3(),
					source.getFeedbackCriteria4(), source.getFeedbackCriteria5(), source.getComments(), source.getSuggestions());
	}

}
