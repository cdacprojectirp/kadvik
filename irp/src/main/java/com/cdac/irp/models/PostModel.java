package com.cdac.irp.models;

import java.time.LocalDate;
import java.time.LocalTime;

import com.cdac.irp.pojos.Student;

public class PostModel {

	private Integer prn;
	private String postText;

	private LocalDate date;
	private LocalTime time;
	public PostModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getPrn() {
		return prn;
	}


	public void setPrn(Integer prn) {
		this.prn = prn;
	}




	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public LocalTime getTime() {
		return time;
	}


	public void setTime(LocalTime time) {
		this.time = time;
	}
	
}
