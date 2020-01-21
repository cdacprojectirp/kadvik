package com.cdac.irp.pojos;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class TimeTableId implements Serializable {
	
private static final long serialVersionUID = 1L;
private String day;
private Integer courseId;
public String getDay() {
	return day;
}
public void setDay(String day) {
	this.day = day;
}
public Integer getCourseId() {
	return courseId;
}
public void setCourseId(Integer courseId) {
	this.courseId = courseId;
}
@Override
public String toString() {
	return "TimeTableId [day=" + day + ", courseId=" + courseId + "]";
}
public TimeTableId(String day, Integer courseId) {
	super();
	this.day = day;
	this.courseId = courseId;
}
public TimeTableId() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
	result = prime * result + ((day == null) ? 0 : day.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	TimeTableId other = (TimeTableId) obj;
	if (courseId == null) {
		if (other.courseId != null)
			return false;
	} else if (!courseId.equals(other.courseId))
		return false;
	if (day == null) {
		if (other.day != null)
			return false;
	} else if (!day.equals(other.day))
		return false;
	return true;
}

}
