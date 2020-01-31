package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.irp.dao.IStudentDao;
import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Override
	public Integer Authenticate(String email, String password)throws Exception {
		return dao.Authenticate(email, password);
	}

	@Override
	public List<Student> getAllStudents() throws Exception{
		return dao.getAllStudents();
	}

	@Override
	public StudentRegisterRequestModel RegisterStudent(StudentRegisterRequestModel _student) throws Exception{
		return dao.Registration(_student);

	}

	@Override
	public Student getStudentByPrn(Integer prn) throws Exception{
		return dao.getStudentByPrn(prn);
	}

}
