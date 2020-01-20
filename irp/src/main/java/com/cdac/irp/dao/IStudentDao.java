package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;

public interface IStudentDao {

	Integer Authenticate(String username, String password);

	List<Student> getAllStudents();

	void Registration(StudentRegisterRequestModel regStudent);
}
