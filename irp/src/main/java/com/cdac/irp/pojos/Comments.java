package com.cdac.irp.pojos;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Comments {
///	@EmbeddedId
	@Id //So user can enter multiple comments
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer commentId;
	
	@MapsId("prn")
	@ManyToOne
	@JoinColumn(name="prn")
	@JsonIgnore
	private Student stud;
	
	private String commentText;
	
	@MapsId("postId")
	@ManyToOne
	@JoinColumn(name="postId")
	@JsonIgnore
	private Posts post;

	//Local Date & Time of Server will be picked up on request. 
	private LocalDate date;
	private LocalTime time;
	
	public Comments() {
		super();
	}

	public Comments(Integer commentId, Student stud, String commentText, Posts post, LocalDate date, LocalTime time) {
		super();
		this.commentId = commentId;
		this.stud = stud;
		this.commentText = commentText;
		this.post = post;
		this.date = date;
		this.time = time;
	}


	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public void setStud(Student stud) {
		this.stud = stud;
	}
	

	public Student getStud() {
		return stud;
	}


	public String getCommentText() {
		return commentText;
	}

	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}

	public Posts getPost() {
		return post;
	}

	public void setPost(Posts post) {
		this.post = post;
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

	@Override
	public String toString() {
		return "Comments [commentId=" + commentId + ", stud=" + stud.getPrn() + ", commentText=" + commentText + "]";
	}

	
	
}
