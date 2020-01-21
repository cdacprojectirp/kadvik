package com.cdac.irp.models;

public class FeedbackAddFeedbackRequestModel {
	
	private Integer prn;
	private Integer facultyId;
	private Integer punctuality;
	private Integer interaction;
	private Integer teaching;
	private Integer assignment;
	private String comments;
	
	public Integer getPrn() {
		return prn;
	}
	
	public Integer getFacultyId() {
		return facultyId;
	}
	
	public Integer getPunctuality() {
		return punctuality;
	}
	
	public Integer getInteraction() {
		return interaction;
	}
	
	public Integer getTeaching() {
		return teaching;
	}
	
	public Integer getAssignment() {
		return assignment;
	}
	
	public String getComments() {
		return comments;
	}
	
	
}
