package com.cg.fms.service;

import java.util.List;

import com.cg.fms.model.CourseModel;
import com.cg.fms.model.EmployeeModel;

public interface ICourseMaintenance {

	public CourseModel addCourse(CourseModel course) throws Exception;

	CourseModel updateCourse(long course_id , CourseModel com) throws  Exception;
	
	public CourseModel getById(long l) throws Exception;

	public List<CourseModel> getAll();
}
