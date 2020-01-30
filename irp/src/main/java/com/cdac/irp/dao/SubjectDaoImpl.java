package com.cdac.irp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.Student;
import com.cdac.irp.pojos.Subject;

@Repository
public class SubjectDaoImpl implements ISubjectDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Subject> getAllSubjects(Integer prn) {
		Student s = entityManager.unwrap(Session.class).load(Student.class, prn);
		Integer cId = s.getCourse().getCourseId();
	
		String jpql = "SELECT s FROM Subject s WHERE s.course.courseId=:cid";

		List<Subject> subjects = entityManager.unwrap(Session.class).createQuery(jpql, Subject.class)
				.setParameter("cid", cId).getResultList();

		return subjects;
	}

	@Override
	public Subject getSubject(Integer subjectId) {
		return entityManager.unwrap(Session.class).load(Subject.class, subjectId);
	}

}
