package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.irp.dao.ICourseDao;
import com.cdac.irp.models.CourseGetResponseModel;

@Service
@Transactional
public class CourseServiceImpl implements ICourseService {

	@Autowired
	private ICourseDao dao;
	
	@Override
	public List<CourseGetResponseModel> getAllCourse() {
		return dao.getAllCourse();
	}

}
