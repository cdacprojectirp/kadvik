package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.ISubjectDao;
import com.cdac.irp.pojos.Subject;

@Service
public class SubjectServiceImpl implements ISubjectService {

	@Autowired
	private ISubjectDao dao;

	@Override
	public List<Subject> getSubjectNames(Integer prn) throws Exception{
		List<Subject> subjects = dao.getAllSubjects(prn);
		return subjects;
	}

}
