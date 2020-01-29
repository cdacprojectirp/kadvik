package com.cdac.irp.pojos;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer facultyId;
	private String facultyName;
	private Double salary;
	private Integer experience;

	@JsonIgnore
	@OneToOne(mappedBy = "faculty")
	private Subject subject;
	

	public Faculty() {
		System.out.println("in faculty pojo");
	}

	public Faculty(Integer facultyId, String facultyName, Double salary, Integer experience, Subject subject) {
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

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
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

	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", salary=" + salary
				+ ", experience=" + experience + ", subject=" + subject + "]";
	}
	
	

}
