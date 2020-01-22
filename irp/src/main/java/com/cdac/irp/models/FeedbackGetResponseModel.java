package com.cdac.irp.models;

public class FeedbackGetResponseModel {
	private Integer punctuality;
	private Integer interaction;
	private Integer teaching;
	private Integer assignment;
	private String comments;
	
	public FeedbackGetResponseModel() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPunctuality() {
		return punctuality;
	}

	public void setPunctuality(Integer punctuality) {
		this.punctuality = punctuality;
	}

	public Integer getInteraction() {
		return interaction;
	}

	public void setInteraction(Integer interaction) {
		this.interaction = interaction;
	}

	public Integer getTeaching() {
		return teaching;
	}

	public void setTeaching(Integer teaching) {
		this.teaching = teaching;
	}

	public Integer getAssignment() {
		return assignment;
	}

	public void setAssignment(Integer assignment) {
		this.assignment = assignment;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "FeedbackGetResponseModel [punctuality=" + punctuality + ", interaction=" + interaction + ", teaching="
				+ teaching + ", assignment=" + assignment + ", comments=" + comments + "]";
	}
	
	
	
	
}
