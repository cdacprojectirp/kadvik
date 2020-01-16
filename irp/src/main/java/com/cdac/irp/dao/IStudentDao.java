package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.pojos.Student;

public interface IStudentDao {

	Student Authenticate(String username, String password);
	List<Student> getAllStudents();
	
}
