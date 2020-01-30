package com.cdac.irp.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Result {

	@EmbeddedId
	private PKStudentSubject result_id;

	@JsonIgnore
	@MapsId("prn") // map embeddable primary key prn with student table
	@ManyToOne
	@JoinColumn(name = "prn") // to keep column name as prn, else the name becomes student_prn ie
								// instanceName_its pk name
	private Student student;

	@JsonIgnore
	@MapsId("subjectId")
	@ManyToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;

	private Integer marks;

	public Result() {
		System.out.println("in result pojo");
	}

	public PKStudentSubject getResult_id() {
		return result_id;
	}

	public void setResult_id(PKStudentSubject result_id) {
		this.result_id = result_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Result [marks=" + marks + "]";
	}
	
	
}
