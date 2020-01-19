package com.cdac.irp.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	private Integer prn;
	private Integer facultyId;
	
	//feedbacks
	private Integer punctuality;
	private Integer interaction;
	private Integer teaching;
	private Integer assignment;
	private String comments;
	
	@Id
	public Integer getPrn() {
		return prn;
	}
	
	public void setPrn(Integer prn) {
		this.prn = prn;
	}
	
	public Integer getFacultyId() {
		return facultyId;
	}
	
	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
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

}
