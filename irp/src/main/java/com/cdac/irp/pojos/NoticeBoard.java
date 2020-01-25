package com.cdac.irp.pojos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class NoticeBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int noticeId;
	
	@OneToOne
	@JoinColumn(name="courseId")
	@JsonIgnore
	private Course course;
	
	private String notice;
	private Date noticeDate;
	private String heading;

	public NoticeBoard() {
		super();
		System.out.println("in noticeboard pojo");
	}
	
	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}

	
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public NoticeBoard(int noticeId, String notice, Date noticeDate, String heading) {
		super();
		this.noticeId = noticeId;
		this.notice = notice;
		this.noticeDate = noticeDate;
		this.heading = heading;
	}

	@Override
	public String toString() {
		return "NoticeBoard [noticeId=" + noticeId + ", course=" + course + ", notice=" + notice + ", noticeDate="
				+ noticeDate + ", heading=" + heading + "]";
	}

	

	
	
	
}
