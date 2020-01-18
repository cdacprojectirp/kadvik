package com.cdac.irp.pojos;

import javax.persistence.*;

@Entity
public class Result {

	@EmbeddedId
	private PKStudentSubject pkStudentSubject;
	private Integer marks;

	public Result() {
		System.out.println("in result pojo");
	}

	public Result(PKStudentSubject pkStudentSubject, Integer marks) {
		super();
		this.pkStudentSubject = pkStudentSubject;
		this.marks = marks;
	}

	public PKStudentSubject getPkStudentSubject() {
		return pkStudentSubject;
	}

	public void setPkStudentSubject(PKStudentSubject pkStudentSubject) {
		this.pkStudentSubject = pkStudentSubject;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}
