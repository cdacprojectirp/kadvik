package com.cdac.irp.models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CommentsModel {

	private Integer prn;
	private String commentText;
	private Integer postId;

	private LocalDate date;
	private LocalTime time;
 	public CommentsModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CommentsModel(Integer prn, String commentText, Integer postId, LocalDate date, LocalTime time) {
		super();
		this.prn = prn;
		this.commentText = commentText;
		this.postId = postId;
		this.date = date;
		this.time = time;
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
