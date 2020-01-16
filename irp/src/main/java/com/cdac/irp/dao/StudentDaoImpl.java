package com.cdac.irp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.Student;

@Repository
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private EntityManager em;

	@Override
	public Student Authenticate(String email, String password) {
		Student s;
		String jpql = "select s from Student s where s.email=:em and s.password=:pa";
		try {
			s = em.unwrap(Session.class).createQuery(jpql, Student.class).setParameter("em", email)
					.setParameter("pa", password).getSingleResult();
		} catch (Exception e) {
			return null;
		}
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		String jpql = "select s from Student s";
		return em.unwrap(Session.class).createQuery(jpql, Student.class).getResultList();
	}

}
