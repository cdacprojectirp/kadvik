package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.FacultyGetAllResponseModel;
import com.cdac.irp.models.FacultyGetResponseModel;
import com.cdac.irp.pojos.Faculty;
import com.cdac.irp.pojos.Student;

@Repository
public class FacultyDaoImpl implements IFacultyDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Faculty getfaculty(int id) {
		String jpql = "select f from Faculty f where id=:id";
		return entityManager.unwrap(Session.class).createQuery(jpql, Faculty.class).getSingleResult();
	}
	
	@Override
	public List<FacultyGetAllResponseModel> getAll(){
		String jpql = "select f.facultyId, f.facultyName, f.salary, f.experience from Faculty f";
		List<Object[]> ol = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).getResultList();
		List<FacultyGetAllResponseModel> fl = new ArrayList<>();
		for (Object[] o : ol) {
			FacultyGetAllResponseModel model = new FacultyGetAllResponseModel();
			int i = 0;
			model.setFacultyId((Integer)o[i++]);
			model.setFacultyName((String)o[i++]);
			model.setSalary((Double)o[i++]);
			model.setExperience((Integer) o[i++]);
			fl.add(model);
		}
		return fl;
	}
	
	@Override
	public List<FacultyGetResponseModel> getFacultyListByStudentPrn(Integer prn) {
		Student s = entityManager.unwrap(Session.class).load(Student.class, prn);
		Integer courseId = s.getCourse().getCourseId();
		String courseName = s.getCourse().getCourseName();
		
		String jpql = "SELECT f.facultyId, f.facultyName, s.subjectName FROM Subject s INNER JOIN s.faculty f WHERE s.course.courseId=:cId";

		List<Object[]> ol = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).setParameter("cId", courseId).getResultList();
		List<FacultyGetResponseModel> fl = new ArrayList<>();
		
		for (Object[] o : ol) {
			FacultyGetResponseModel model = new FacultyGetResponseModel();
			int i = 0;
			model.setFacultyId(((Integer)o[i++]));
			model.setFacultyName((String)o[i++]);
			model.setSubjectName((String)o[i++]);
			model.setCourseName(courseName);
			fl.add(model);
		}
		
		return fl;
	}

	


}
