package com.cg.fms.model;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



public class FeedbackTrainerModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@NotNull(message = "trainer id cannot be null")
	@NotEmpty(message = "trainer id cannot be empty")
	private String trainerId;							//TrainerId can't be null or empty

	private int feedbackCriteria1;							//feedback criteria can't be null or empty

	private int feedbackCriteria2;							//feedback criteria can't be null or empty

	private int feedbackCriteria3;							//feedback criteria can't be null or empty

	private int feedbackCriteria4;							//feedback criteria can't be null or empty

	private int feedbackCriteria5;							//feedback criteria can't be null or empty

	private String comments;								//comments can't be empty

	private String suggestions;								//suggestions can't be empty




	public FeedbackTrainerModel(
			@NotNull(message = "trainer id cannot be null") @NotEmpty(message = "trainer id cannot be empty") @NotNull(message = "trainer id cannot be null") @NotEmpty(message = "trainer id cannot be empty") String trainerId,
			 int feedbackCriteria1,
			 int feedbackCriteria2,
			 int feedbackCriteria3,
			 int feedbackCriteria4,
			 int feedbackCriteria5,
			String comments, String suggestions) {
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + feedbackCriteria1;
		result = prime * result + feedbackCriteria2;
		result = prime * result + feedbackCriteria3;
		result = prime * result + feedbackCriteria4;
		result = prime * result + feedbackCriteria5;
		result = prime * result + ((suggestions == null) ? 0 : suggestions.hashCode());
		result = prime * result + ((trainerId == null) ? 0 : trainerId.hashCode());
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
		FeedbackTrainerModel other = (FeedbackTrainerModel) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (feedbackCriteria1 != other.feedbackCriteria1)
			return false;
		if (feedbackCriteria2 != other.feedbackCriteria2)
			return false;
		if (feedbackCriteria3 != other.feedbackCriteria3)
			return false;
		if (feedbackCriteria4 != other.feedbackCriteria4)
			return false;
		if (feedbackCriteria5 != other.feedbackCriteria5)
			return false;
		if (suggestions == null) {
			if (other.suggestions != null)
				return false;
		} else if (!suggestions.equals(other.suggestions))
			return false;
		if (trainerId == null) {
			if (other.trainerId != null)
				return false;
		} else if (!trainerId.equals(other.trainerId))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Feedback of the Trainer is /n [trainerId=" + trainerId + ", feedbackCriteria1=" + feedbackCriteria1
				+ ", feedbackCriteria2=" + feedbackCriteria2 + ", feedbackCriteria3=" + feedbackCriteria3
				+ ", feedbackCriteria4=" + feedbackCriteria4 + ", feedbackCriteria5=" + feedbackCriteria5
				+ ", comments=" + comments + ", suggestions=" + suggestions + "]";
	}






}
