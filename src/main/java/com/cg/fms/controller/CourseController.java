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
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cg.fms.model.CourseModel;
import com.cg.fms.model.EmployeeModel;
import com.cg.fms.service.ICourseMaintenance;

/* This is a course Controller*/
@RestController
@RequestMapping(path="/course")
public class CourseController {

	@Autowired
	private ICourseMaintenance courseService;

	/*
	 * to retrieve all courses
	 * return : List<courses>
	 * params : NIL
	 */

	@GetMapping
	public ResponseEntity<List<CourseModel>> getAllCourse(){
		return ResponseEntity.ok(courseService.getAll());
	}


	/*
	 * to add a course
	 * return : course
	 * params : NIL
	 */

	@PostMapping
	public ResponseEntity<CourseModel> addCustomer(@RequestBody @Valid CourseModel course ,BindingResult result) throws Exception {
		course = courseService.addCourse(course);
		return new ResponseEntity<>(course, HttpStatus.CREATED);
	}

	@PutMapping("/{courseId}")
	public ResponseEntity<CourseModel> updateCourse(
			@PathVariable("courseId") long course_id,	
			@RequestBody @Valid CourseModel cm,
			BindingResult result) throws Exception {
		
		return ResponseEntity.ok(courseService.updateCourse(course_id, cm));
	}

	/*
	 * to retrieve a course
	 * return : course
	 * params : course Id
	 */

	@GetMapping("/{courseId}")
	public ResponseEntity<CourseModel> findCourse(@PathVariable("course_id") Long id) throws Exception {
		ResponseEntity<CourseModel> response = null;
		CourseModel course = courseService.getById(id);
		if (course == null) {
			response = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			response = new ResponseEntity<>(course, HttpStatus.OK);
		}
		return response;
	}
}