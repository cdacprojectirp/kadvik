package com.cdac.irp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseId;
	String courseName;
	


	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private List<Subject> subjects = new ArrayList<Subject>();

	@OneToMany(mappedBy = "course")
	private List<Student> students = new ArrayList<Student>();

	public Course() {
		System.out.println("in course pojo");
	}


	public Course(int courseId, String courseName,  List<Subject> subjects,
			List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		//this.timeTable = timeTable;
		this.subjects = subjects;
		this.students = students;
	}


	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


//	public TimeTable getTimeTable() {
//		return timeTable;
//	}
//
//
//	public void setTimeTable(TimeTable timeTable) {
//		this.timeTable = timeTable;
//	}





}
