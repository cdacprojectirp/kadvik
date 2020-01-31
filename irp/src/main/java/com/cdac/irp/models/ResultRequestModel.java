package com.cdac.irp.models;

public class ResultRequestModel {
	Integer prn;
	Integer subjectId;
	Integer Marks;

	public ResultRequestModel() {
//		System.out.println("in Result req model");
	}

	public Integer getPrn() {
		return prn;
	}

	public void setPrn(Integer prn) {
		this.prn = prn;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public Integer getMarks() {
		return Marks;
	}

	public void setMarks(Integer marks) {
		Marks = marks;
	}

}
