package com.cdac.irp.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class PostsModelResponse {
	private Integer postId;
	private String postText;
	private String firstName;
	private String lastName;

	private LocalDate date;
	private LocalTime time;
	public PostsModelResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostsModelResponse(Integer postId, String postText, String firstName, String lastName, LocalDate date,
			LocalTime time) {
		super();
		this.postId = postId;
		this.postText = postText;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.time = time;
	}

	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public String getPostText() {
		return postText;
	}
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
