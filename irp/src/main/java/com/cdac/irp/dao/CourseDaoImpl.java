package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.CourseGetResponseModel;
import com.cdac.irp.pojos.Course;
import com.cdac.irp.pojos.Student;

@Repository
public class CourseDaoImpl implements ICourseDao {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<CourseGetResponseModel> getAllCourse() {
		String jpql = "select c from Course c";
		List<Course> courses = entityManager.unwrap(Session.class).createQuery(jpql,Course.class).getResultList();
		
		List<CourseGetResponseModel> courseList = new ArrayList<CourseGetResponseModel>();
		for(Course c:courses) {
			courseList.add(new CourseGetResponseModel(c.getCourseId(),c.getCourseName()));
		}
		return courseList;
	}
	
	@Override
	public Course getCourseByStudentPrn(Integer prn) {
		Student s = entityManager.unwrap(Session.class).load(Student.class, prn);
		Course c = s.getCourse();
		return c;
	}

}
