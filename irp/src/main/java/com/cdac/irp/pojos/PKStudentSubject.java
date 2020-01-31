package com.cdac.irp.pojos;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PKStudentSubject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer prn;

	private Integer subjectId;

	public PKStudentSubject() {
//		System.out.println("in pk student subject");
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
