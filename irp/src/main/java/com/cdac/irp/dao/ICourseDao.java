package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.CourseGetResponseModel;

public interface ICourseDao {
	List<CourseGetResponseModel> getAllCourse();
}
