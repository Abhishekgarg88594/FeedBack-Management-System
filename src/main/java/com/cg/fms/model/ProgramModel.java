package com.cg.fms.model;

import java.io.Serializable;
import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class ProgramModel implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long trainingId;				//trainingId can be null

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate startDate;			//Date format should be standard

	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate endDate;				//Date format should be standard

	private Long course;					//course detail can't be empty

	private String feedback;				//feedback can't be empty

	public ProgramModel() {
		//no implementations
	}

	public ProgramModel(Long trainingId, LocalDate startDate, LocalDate endDate, Long course, String feedback) {
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


	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public Long getCourse() {
		return course;
	}

	public void setCourse(Long course) {
		this.course = course;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((feedback == null) ? 0 : feedback.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((trainingId == null) ? 0 : trainingId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProgramModel other = (ProgramModel) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (feedback == null) {
			if (other.feedback != null)
				return false;
		} else if (!feedback.equals(other.feedback))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (trainingId == null) {
			if (other.trainingId != null)
				return false;
		} else if (!trainingId.equals(other.trainingId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("ProgramModel [trainingId=%s, startDate=%s, endDate=%s, course=%s, feedback=%s]",
				trainingId, startDate, endDate, course, feedback);
	}

}