package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.Question;

@Repository
public class QuestionDaoImpl implements IQuestionDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Question> getQuestionList() {
		// String jpql = "select q.question_id q.question, q.option1, q.option2,
		// q.option3, q.option4 from Question q";
		String jpql = "SElECT q.question, q.option1 FROM Question AS q";
		List<Object[]> olt = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).getResultList();
		System.out.println(olt);
		List<Question> lt = new ArrayList<>();
		Question q = new Question();
		for (Object[] oa : olt) {
			q.setQuestion((String) oa[0]);
			q.setOption1((String) oa[1]);
			lt.add(q);
		}
		return lt;
	}

	@Override
	public void setQuestion(Question qst, int subId) {
		String jpql = "INSERT INTO question (answer,image)";

	}

}