package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.pojos.Subject;

public interface ISubjectDao {

	List<Subject> getAllSubjects(Integer prn) throws Exception;
	
	//retrieve
	Subject getSubject(Integer subjectId) throws Exception;
	

}
