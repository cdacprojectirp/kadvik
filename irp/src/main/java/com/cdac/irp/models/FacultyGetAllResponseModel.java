package com.cdac.irp.models;

public class FacultyGetAllResponseModel {

	private Integer facultyId;
	private String facultyName;
	private Double salary;
	private Integer experience;
	
	public Integer getFacultyId() {
		return facultyId;
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public Integer getExperience() {
		return experience;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

}
