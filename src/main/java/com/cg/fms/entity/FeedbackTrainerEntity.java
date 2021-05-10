package com.cg.fms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fdtrainer")
public class FeedbackTrainerEntity implements Serializable {

	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="trainer_id")
	private String trainerId;			//primary key trainerId

	@Column(name = "fdc1")
	private int feedbackCriteria1;		//feedback1 for trainer


	@Column(name = "fdc2")
	private int feedbackCriteria2;		//feedback2 for trainer


	@Column(name = "fdc3")
	private int feedbackCriteria3;		//feedback3 for trainer


	@Column(name = "fdc4")
	private int feedbackCriteria4;		//feedback4 for trainer


	@Column(name = "fdc5")
	private int feedbackCriteria5;		//feedback5 for trainer


	@Column(name = "comments")
	private String comments;			//comments for trainer


	@Column(name = "suggestions")
	private String suggestions;			//suggestions for the trainer

	@OneToMany(mappedBy = "fbtrainer")
	private Set<Employee> employees;		//one to many mapping of trainer with employees

	public FeedbackTrainerEntity() {
		//default
	}

	public FeedbackTrainerEntity(String trainerId, int feedbackCriteria1, int feedbackCriteria2, int feedbackCriteria3,
			int feedbackCriteria4, int feedbackCriteria5, String comments, String suggestions) {
		super();
		this.trainerId = trainerId;
		this.feedbackCriteria1 = feedbackCriteria1;
		this.feedbackCriteria2 = feedbackCriteria2;
		this.feedbackCriteria3 = feedbackCriteria3;
		this.feedbackCriteria4 = feedbackCriteria4;
		this.feedbackCriteria5 = feedbackCriteria5;
		this.comments = comments;
		this.suggestions = suggestions;
	}


	public String getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}


	public int getFeedbackCriteria1() {
		return feedbackCriteria1;
	}


	public void setFeedbackCriteria1(int feedbackCriteria1) {
		this.feedbackCriteria1 = feedbackCriteria1;
	}


	public int getFeedbackCriteria2() {
		return feedbackCriteria2;
	}


	public void setFeedbackCriteria2(int feedbackCriteria2) {
		this.feedbackCriteria2 = feedbackCriteria2;
	}


	public int getFeedbackCriteria3() {
		return feedbackCriteria3;
	}


	public void setFeedbackCriteria3(int feedbackCriteria3) {
		this.feedbackCriteria3 = feedbackCriteria3;
	}


	public int getFeedbackCriteria4() {
		return feedbackCriteria4;
	}


	public void setFeedbackCriteria4(int feedbackCriteria4) {
		this.feedbackCriteria4 = feedbackCriteria4;
	}


	public int getFeedbackCriteria5() {
		return feedbackCriteria5;
	}


	public void setFeedbackCriteria5(int feedbackCriteria5) {
		this.feedbackCriteria5 = feedbackCriteria5;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getSuggestions() {
		return suggestions;
	}


	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}



	@Override
	public String toString() {
		return "Feedback of the Trainer is /n [trainerId=" + trainerId + ", feedbackCriteria1=" + feedbackCriteria1
				+ ", feedbackCriteria2=" + feedbackCriteria2 + ", feedbackCriteria3=" + feedbackCriteria3
				+ ", feedbackCriteria4=" + feedbackCriteria4 + ", feedbackCriteria5=" + feedbackCriteria5
				+ ", comments=" + comments + ", suggestions=" + suggestions + "]";
	}






}
