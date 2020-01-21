package com.cdac.irp.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.pojos.Faculty;
import com.cdac.irp.pojos.Feedback;
import com.cdac.irp.pojos.PKStudentFaculty;
import com.cdac.irp.pojos.Student;

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
	public FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request) {
		Integer prn = _request.getPrn();
		Integer facultyId = _request.getFacultyId();
		
		Student student = entityManager.unwrap(Session.class).load(Student.class, prn);
		Faculty faculty = entityManager.unwrap(Session.class).load(Faculty.class, facultyId);
		PKStudentFaculty pksf= new PKStudentFaculty(prn, facultyId);
		
		Feedback feedback = new Feedback(pksf, student,faculty,_request.getPunctuality(),_request.getInteraction(),_request.getTeaching(),_request.getAssignment(),_request.getComments());
		
		entityManager.unwrap(Session.class).save(feedback);
		return _request;
	}

}
