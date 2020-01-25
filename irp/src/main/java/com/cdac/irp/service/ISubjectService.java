package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.pojos.Subject;

public interface ISubjectService {

	List<Subject> getSubjectNames(Integer prn);
	
}
