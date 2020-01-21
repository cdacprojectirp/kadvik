package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.irp.dao.IFacultyDao;
import com.cdac.irp.models.FacultyGetAllResponseModel;
import com.cdac.irp.models.FacultyGetResponseModel;

@Service
@Transactional
public class FacultyServiceImpl implements IFacultyService {
	
	@Autowired
	IFacultyDao dao;

	@Override
	public List<FacultyGetAllResponseModel> getAll() {
		return dao.getAll();
	}

	@Override
	public List<FacultyGetResponseModel> getFacultyListByStudentPrn(Integer prn) {
		return dao.getFacultyListByStudentPrn(prn);
	}
	
	

}
