package com.cdac.irp.models;

public class TimeTableUpdateRequestModel {
	private String day;
	private String periodA;
	private String periodB;
	private String periodC;
	private Integer courseId;
	
	public TimeTableUpdateRequestModel(String day, String periodA, String periodB, String periodC, Integer courseId) {
		super();
		this.day = day;
		this.periodA = periodA;
		this.periodB = periodB;
		this.periodC = periodC;
		this.courseId = courseId;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getPeriodA() {
		return periodA;
	}
	public void setPeriodA(String periodA) {
		this.periodA = periodA;
	}
	public String getPeriodB() {
		return periodB;
	}
	public void setPeriodB(String periodB) {
		this.periodB = periodB;
	}
	public String getPeriodC() {
		return periodC;
	}
	public void setPeriodC(String periodC) {
		this.periodC = periodC;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "TimeTableUpdateRequestModel [day=" + day + ", periodA=" + periodA + ", periodB=" + periodB
				+ ", periodC=" + periodC + ", courseId=" + courseId + "]";
	}
	
}
