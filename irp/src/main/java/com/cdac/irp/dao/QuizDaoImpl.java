package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.AnswerModel;
import com.cdac.irp.pojos.Question;

@Repository
public class QuizDaoImpl implements IQuizDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Question> getQuestionList() {
		String jpql = "SElECT q.questionId, q.question, q.option1, q.option2, q.option3, q.option4 FROM Question AS q";
		List<Object[]> olt = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).getResultList();
		// System.out.println(olt);
		List<Question> lt = new ArrayList<>();
		for (Object[] oa : olt) {
			Question q = new Question();
			int i = 0;
			q.setQuestionId((Integer) oa[i++]);
			q.setQuestion((String) oa[i++]);
			q.setOption1((String) oa[i++]);
			q.setOption2((String) oa[i++]);
			q.setOption3((String) oa[i++]);
			q.setOption4((String) oa[i++]);
			// System.out.println(q);
			lt.add(q);
		}
		// System.out.println(lt);
		return lt;
	}

	@Override
	public void setQuestion(Question qst, int subId) {
		String jpql = "INSERT INTO question (answer,image)";

	}
	
	@Override
	public List<AnswerModel> getAnswerList() {
		String jpql = "SElECT q.questionId, q.answer FROM Question AS q";
		List<Integer[]> olt = entityManager.unwrap(Session.class).createQuery(jpql, Integer[].class).getResultList();
		List<AnswerModel> lt = new ArrayList<>();
		for (Integer[] oa : olt) {
			AnswerModel am = new AnswerModel();
			int i = 0;
			am.setQuestionId(oa[i++]);
			am.setAnswer(oa[i++]);
			lt.add(am);
		}
		return lt;
	}

}