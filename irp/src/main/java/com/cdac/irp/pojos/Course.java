package com.cdac.irp.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer courseId;
	private String courseName;
	

	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Subject> subjects = new ArrayList<Subject>();

	@JsonIgnore
	@OneToMany(mappedBy = "course")
	private List<Student> students = new ArrayList<Student>();

	public Course() {
//		System.out.println("in course pojo");
	}

	public Course(Integer courseId, String courseName, List<Subject> subjects, List<Student> students) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.subjects = subjects;
		this.students = students;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
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

}
