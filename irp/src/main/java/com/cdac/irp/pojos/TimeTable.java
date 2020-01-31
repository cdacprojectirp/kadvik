package com.cdac.irp.pojos;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table
public class TimeTable{
	
//	@EmbeddedId
//	private TimeTableId id;
	@OneToOne
	@JoinColumn(name="courseId")
	@JsonIgnore
	private Course courseId;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dayId;
	private String day;
	private String periodA;
	private String periodB;
	private String periodC;
	public TimeTable() {
		super();
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
	public Integer getDayId() {
		return dayId;
	}
	public void setDayId(Integer dayId) {
		this.dayId = dayId;
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


	public TimeTable( String day,String periodA, String periodB, String periodC) {
		super();
		this.day = day;
		this.periodA = periodA;
		this.periodB = periodB;
		this.periodC = periodC;
	}

	@Override
	public String toString() {
		
		return "TimeTable [day=" + day + ", periodA=" + periodA + ", periodB=" + periodB + ", periodC=" + periodC + "]";
	}	
	

	
	
}
