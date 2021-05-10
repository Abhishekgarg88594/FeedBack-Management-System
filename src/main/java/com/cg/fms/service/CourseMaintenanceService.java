package com.cg.fms.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.fms.model.CourseModel;
import com.cg.fms.repository.CourseRepo;

@Service
public class CourseMaintenanceService implements ICourseMaintenance {

	@Autowired
	private CourseRepo courseRepo;

	
	@Autowired
	private EMParser parser;
	
	/*
	 * A default Constructor with no implementation
	 */
	
	public CourseMaintenanceService() {

	}

	/*
	 * Corresponding Getters and Setters for private members
	 * 
	 */

	public CourseMaintenanceService(CourseRepo courseRepo) {
		super();
		this.courseRepo = courseRepo;
		this.parser = new EMParser();
	}

	/*
	 * service implementation for add course
	 */
	
	@Transactional
	@Override
	public CourseModel addCourse(CourseModel course) throws Exception {
		if(course != null) {
			if(courseRepo.existsById(course.getCourseId())) {
				throw new Exception("Course with this Id already exists");
			}

			course = parser.parse(courseRepo.save(parser.parse(course)));
		}

		return course;

	}

	//	@Transactional
	//	@Override
	//	public CourseModel updateCourseName(Long id, String string) throws Exception {
	//		if(!courseRepo.existsById(id))
	//			throw new Exception("No course found with this Id");
	//		
	//		courseRepo.update(id, string);
	//		
	//		return getById(id);
	//	}
	
	/*
	 * service implementation for course get by courseId
	 */

	@Transactional
	@Override
	public CourseModel getById(long l) throws Exception {
		if(!courseRepo.existsById(l))
			throw new Exception("No course found with this Id");

		return parser.parse(courseRepo.findById(l).get());
	}
	/*
	 * service implementation for finding  courseList
	 */
	@Transactional
	@Override
	public List<CourseModel> getAll() {
		return courseRepo.findAll().stream().map(parser::parse).collect(Collectors.toList());
	}

	@Override
	public CourseModel updateCourse(long course_id, CourseModel com) throws Exception {
		if (com!= null) {
			if (!courseRepo.existsById(course_id)) {
				throw new Exception("No Such Employee");
			}

			com = parser.parse(courseRepo.save(parser.parse(com)));
		}

		return com;
	}

}
