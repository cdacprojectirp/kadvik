package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;

public interface IStudentService {

	Integer Authenticate(String email, String password) throws Exception;

	List<Student> getAllStudents() throws Exception;

	StudentRegisterRequestModel RegisterStudent(StudentRegisterRequestModel _student) throws Exception;

	Student getStudentByPrn(Integer prn) throws Exception;
}
