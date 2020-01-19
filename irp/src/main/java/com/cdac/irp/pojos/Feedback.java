package com.cdac.irp.pojos;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Feedback {
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;
	@OneToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	//feedbacks
	private Integer punctuality;
	private Integer interaction;
	private Integer teaching;
	private Integer assignment;
	private String comments;
	
	public Student getStudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
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