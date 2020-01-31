package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.FacultyGetResponseModel;
import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.models.FeedbackGetResponseModel;
import com.cdac.irp.pojos.Faculty;
import com.cdac.irp.pojos.Feedback;
import com.cdac.irp.pojos.PKStudentFaculty;
import com.cdac.irp.pojos.Student;

@Repository
public class FeedbackDaoImpl implements IFeedbackDao{
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public FeedbackGetResponseModel getFeedback(int prn, int facultyId) {
		String jpql = "SELECT f.assignment, f.interaction, f.punctuality, f.teaching, f.comments from Feedback f where f.feedbackId.prn=:_prn and f.feedbackId.facultyId=:_facultyId";
		try {
			List<Object[]> ol = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).setParameter("_prn", prn).setParameter("_facultyId", facultyId).getResultList();
			List<FeedbackGetResponseModel> fl = new ArrayList<>();
			for (Object[] o : ol) {
				FeedbackGetResponseModel model = new FeedbackGetResponseModel();
				int i = 0;
				model.setAssignment((Integer)o[i++]);
				model.setInteraction((Integer)o[i++]);
				model.setPunctuality((Integer)o[i++]);
				model.setTeaching((Integer)o[i++]);
				model.setComments((String)o[i++]);
				fl.add(model);
			}
			return fl.get(0); //return first item of list
		}
		catch(Exception e) {
			return null;
		}
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
