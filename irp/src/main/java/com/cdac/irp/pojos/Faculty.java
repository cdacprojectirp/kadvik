package com.cdac.irp.pojos;

import javax.persistence.*;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facultyId;

	private String facultyName;
	private Integer salary;
	private Integer experience;

	@OneToOne
	@JoinColumn(name = "subject_id")
	private Subject subject;
	
	@OneToOne
	private Feedback feedback;

	public Faculty() {
		System.out.println("in faculty pojo");
	}

	public Faculty(Integer facultyId, String facultyName, Integer salary, Integer experience, Subject subject) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.salary = salary;
		this.experience = experience;
		this.subject = subject;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

}
