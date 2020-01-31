package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;

public interface IStudentDao {

	Integer Authenticate(String username, String password)throws Exception;

	List<Student> getAllStudents()throws Exception;

	StudentRegisterRequestModel Registration(StudentRegisterRequestModel regStudent)throws Exception;
	
	Student getStudentByPrn(Integer prn)throws Exception;
}
