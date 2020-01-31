package com.cdac.irp.models;

public class ResultResponseModel {
	private Integer marks;
	private String subjectName;

	public ResultResponseModel() {
		System.out.println("in result resp model");
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

}
