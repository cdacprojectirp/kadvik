package com.cdac.irp.pojos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Feedback {
	
	@EmbeddedId
	private PKStudentFaculty feedbackId;
	
	@MapsId("prn")
	@ManyToOne
	@JoinColumn(name="prn")
	private Student student;
	
	@MapsId("facultyId")
	@ManyToOne
	@JoinColumn(name="faculty_id")
	private Faculty faculty;
	
	private Integer punctuality;
	private Integer interaction;
	private Integer teaching;
	private Integer assignment;
	private String comments;
	
	
	
	public Feedback(PKStudentFaculty feedbackId, Student student, Faculty faculty, Integer punctuality, Integer interaction, Integer teaching,
			Integer assignment, String comments) {
		super();
		this.feedbackId = feedbackId;
		this.student = student;
		this.faculty = faculty;
		this.punctuality = punctuality;
		this.interaction = interaction;
		this.teaching = teaching;
		this.assignment = assignment;
		this.comments = comments;
	}

	public PKStudentFaculty getFeedbackId() {
		return feedbackId;
	}
	
	public void setFeedbackId(PKStudentFaculty feedbackId) {
		this.feedbackId = feedbackId;
	}
	
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

	@Override
	public String toString() {
		return "Feedback [student=" + student.getPrn() + ", faculty=" + faculty.getFacultyId()
				+ ", punctuality=" + punctuality + ", interaction=" + interaction + ", teaching=" + teaching
				+ ", assignment=" + assignment + ", comments=" + comments + "]";
	}
	

	
}
