package com.cdac.irp.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.cdac.irp.pojos.Posts;
import com.cdac.irp.pojos.Student;


public class CommentsResponseModel {
	
	
	private String commentText;

	private Integer postId;
	private Integer prn;
	
	private String firstName;
	private String lastName;

	private LocalDate date;
	private LocalTime time;


	public CommentsResponseModel() {
		super();
	}



	public CommentsResponseModel(String commentText, Integer postId, Integer prn, String firstName, String lastName,
			LocalDate date, LocalTime time) {
		super();
		this.commentText = commentText;
		this.postId = postId;
		this.prn = prn;
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
		this.time = time;
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





	public Integer getPrn() {
		return prn;
	}


	public void setPrn(Integer prn) {
		this.prn = prn;
	}


	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}


	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
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
