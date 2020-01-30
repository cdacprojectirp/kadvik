package com.cdac.irp.dao;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.MD5;
import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Course;
import com.cdac.irp.pojos.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Integer Authenticate(String email, String password) {
		Integer prn;
		String jpql = "select s.prn from Student s where s.email=:em and s.password=:pa";
		try {
			
			prn = entityManager.unwrap(Session.class).createQuery(jpql, Integer.class).setParameter("em", email)
					.setParameter("pa", password).getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return prn;
	}

	@Override
	public List<Student> getAllStudents() {
		String jpql = "select s from Student s";
		return entityManager.unwrap(Session.class).createQuery(jpql, Student.class).getResultList();
	}

	@Override
	public StudentRegisterRequestModel Registration(StudentRegisterRequestModel regStudent) {

		Course course = entityManager.unwrap(Session.class).load(Course.class, regStudent.getCourseId());
	
		Student student = new Student(regStudent.getFirstName(),regStudent.getLastName(),
							regStudent.getEmail(),MD5.getMd5(regStudent.getPassword()),
							regStudent.getBirthDate(),course);
		entityManager.unwrap(Session.class).save(student);
		return regStudent;
	}


	//CRUD
	@Override
	public Student getStudentByPrn(Integer prn) {
		return entityManager.unwrap(Session.class).load(Student.class, prn);
	}

}
