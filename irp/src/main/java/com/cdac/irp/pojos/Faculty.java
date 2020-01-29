package com.cdac.irp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	@OneToMany(mappedBy = "faculty")
	private List<Subject> subject= new ArrayList<>();
	

	public Faculty() {
		System.out.println("in faculty pojo");
	}

	public Faculty(Integer facultyId, String facultyName, Double salary, Integer experience, Subject subject) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.salary = salary;
		this.experience = experience;
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

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	
	

}
