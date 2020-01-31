package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.CourseGetResponseModel;
import com.cdac.irp.pojos.Course;

public interface ICourseDao {
	List<CourseGetResponseModel> getAllCourse() throws Exception;
	Course getCourseByStudentPrn(Integer prn) throws Exception;
}
