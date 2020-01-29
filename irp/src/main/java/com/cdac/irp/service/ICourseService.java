package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.CourseGetResponseModel;
import com.cdac.irp.pojos.Course;

public interface ICourseService {
	List<CourseGetResponseModel> getAllCourse();
	Course getCourseByStudentPrn(Integer prn);
}
