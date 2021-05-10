package com.cg.fms.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fdprogram")
public class FeedbackProgramEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="prog_id")
	private String ProgramId;				//primary key ProgramID

	@Column(name = "fdc1")
	private int feedbackCriteria1; 			//feedbackCriteria1 for the program


	@Column(name = "fdc2")
	private int feedbackCriteria2;			//feedbackCriteria2 for the program


	@Column(name = "fdc3")
	private int feedbackCriteria3;			//feedbackCriteria3 for the program


	@Column(name = "fdc4")
	private int feedbackCriteria4;			//feedbackCriteria4 for the program


	@Column(name = "fdc5")
	private int feedbackCriteria5;			//feedbackCriteria5 for the program


	@Column(name = "comments")
	private String comments; 				// comments for the program


	@Column(name = "suggestions")
	private String suggestions;				//suggestions for the program

	@OneToMany(mappedBy = "feedback")
	private Set<Program> programs;			//one to many mapping of feedback with programs

	public FeedbackProgramEntity() {
		// default
	}

	public FeedbackProgramEntity(String programId, int feedbackCriteria1, int feedbackCriteria2, int feedbackCriteria3,
			int feedbackCriteria4, int feedbackCriteria5, String comments, String suggestions) {
		super();
		ProgramId = programId;
		this.feedbackCriteria1 = feedbackCriteria1;
		this.feedbackCriteria2 = feedbackCriteria2;
		this.feedbackCriteria3 = feedbackCriteria3;
		this.feedbackCriteria4 = feedbackCriteria4;
		this.feedbackCriteria5 = feedbackCriteria5;
		this.comments = comments;
		this.suggestions = suggestions;
	}


	public String getProgramId() {
		return ProgramId;
	}


	public void setprogramId(String ProgramId) {
		this.ProgramId = ProgramId;
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



	public Set<Program> getPrograms() {
		return programs;
	}


	public void setPrograms(Set<Program> programs) {
		this.programs = programs;
	}


	@Override
	public String toString() {
		return "Feedback of the Program  is /n [ProgramId=" + ProgramId + ", feedbackCriteria1=" + feedbackCriteria1
				+ ", feedbackCriteria2=" + feedbackCriteria2 + ", feedbackCriteria3=" + feedbackCriteria3
				+ ", feedbackCriteria4=" + feedbackCriteria4 + ", feedbackCriteria5=" + feedbackCriteria5
				+ ", comments=" + comments + ", suggestions=" + suggestions + "]";
	}






}

