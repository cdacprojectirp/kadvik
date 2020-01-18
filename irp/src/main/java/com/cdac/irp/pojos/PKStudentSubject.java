package com.cdac.irp.pojos;

public class PKStudentSubject {
	private Student prn;
	private Subject subject;

	public PKStudentSubject() {
		// TODO Auto-generated constructor stub
	}

	public PKStudentSubject(Student prn, Subject subject) {
		super();
		this.prn = prn;
		this.subject = subject;
	}

	public Student getPrn() {
		return prn;
	}

	public void setPrn(Student prn) {
		this.prn = prn;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
