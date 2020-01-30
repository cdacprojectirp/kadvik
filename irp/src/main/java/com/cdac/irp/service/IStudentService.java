package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;

public interface IStudentService {

	Integer Authenticate(String email, String password);

	List<Student> getAllStudents();

	StudentRegisterRequestModel RegisterStudent(StudentRegisterRequestModel _student);

	Student getStudentByPrn(Integer prn);
}
