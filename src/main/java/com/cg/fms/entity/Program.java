package com.cg.fms.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "programs_master")
public class Program implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "training_id")
	private Long trainingId;				//primary key trainingId

	@Column(name = "start_date")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate startDate;		//start-date for the training

	@Column(name = "end_date")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate endDate;			//end date for the training

	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;				//many to one mapping of course_id with course

	@OneToMany(mappedBy = "program")
	private Set<Employee> employees; 		//one to many mapping of program with employees

	@ManyToOne
	@JoinColumn(name = "program_id")
	private FeedbackProgramEntity feedback;		//many to one mapping of program_id with feedback

	public Program() {
		//no implementations default constructor
	}

	public Program(Long trainingId, LocalDate startDate, LocalDate endDate, Course course,
			FeedbackProgramEntity feedback) {
		super();
		this.trainingId = trainingId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.course = course;
		this.feedback = feedback;
	}



	public Long getTrainingId() {
		return trainingId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public FeedbackProgramEntity getFeedback() {
		return feedback;
	}

	public void setFeedback(FeedbackProgramEntity feedback) {
		this.feedback = feedback;
	}


	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return String.format("trainingId=%s, startDate=%s, endDate=%s", trainingId,
				startDate, endDate);
	}

}