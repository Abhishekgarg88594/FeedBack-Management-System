package com.cg.fms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// Course Entity
@Entity
@Table(name = "courses_master")
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "course_id")
	private Long courseId;  // primary key courseid

	@Column(name = "course_name")
	private String courseName;   // gives course name

	@Column(name = "course_description")
	private String courseDescription;  // gives course description

	@Column(name = "num_of_days")
	private int noOfDays;     // gives number of days

	@OneToMany(mappedBy = "course")
	private Set<Program> programs;      // foreign key one to many mapping to program Entity

	public Course() {
		//no implementation default constructor
	}


	public Course(Long courseId, String courseName, String courseDescription, int noOfDays) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.noOfDays = noOfDays;
	}



	public Long getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}


	public Set<Program> getProgram() {
		return programs;
	}

	public void setProgram(Set<Program> program) {
		this.programs = program;
	}

	@Override
	public String toString() {
		return String.format("Course [courseId=%s, courseName=%s, courseDescription=%s, noOfDays=%s]", courseId,
				courseName, courseDescription, noOfDays);
	}
}
