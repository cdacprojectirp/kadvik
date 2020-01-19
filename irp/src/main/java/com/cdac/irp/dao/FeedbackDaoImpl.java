package com.cdac.irp.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.MD5;
import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Feedback;

@Repository
public class FeedbackDaoImpl implements IFeedbackDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public Feedback getFeedback(int prn, int facultyId) {
		String jpql = "select f from Feedback f where f.prn=:_prn and f.facultyId=:_facultyId";
		Feedback f;
		try {
		 f = entityManager.unwrap(Session.class).createQuery(jpql, Feedback.class).
		 setParameter("_prn", prn).setParameter("_facultyId", facultyId).
		 getSingleResult();
		}
		catch(Exception e) {
			return null;
		}
		return f;
	}
	
	@Override
	public Feedback addFeedback(Feedback f) {
		entityManager.unwrap(Session.class).persist(f);
		return f;
	}

}
