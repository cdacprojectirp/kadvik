package com.cdac.irp.pojos;

import java.io.Serializable;

public class PKStudentFaculty implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer prn;
	
	private Integer facultyId;
	
	public PKStudentFaculty() {
		System.out.println("inside PKStudentFaculty const");
	}

	public PKStudentFaculty(Integer prn, Integer facultyId) {
		super();
		this.prn = prn;
		this.facultyId = facultyId;
	}

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

}
