package com.cdac.irp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.pojos.Question;
import com.cdac.irp.pojos.Subject;

@Repository
public class QuizDaoImpl implements IQuizDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Question> getQuestionList() throws Exception{
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
	public void setQuestion(Question qst, int subId) throws Exception{
		String jpql = "INSERT INTO question (answer,image)";

	}

	@Override
	public List<AnswerResponseModel> getAnswerList(List<AnswerRequestModel> qstIds) throws Exception{
//		String jpql = "SElECT q.questionId, q.answer FROM Question AS q";
//		List<Object[]> olt = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class).getResultList();
//		List<AnswerResponseModel> lt = new ArrayList<>();
//		for (Object[] oa : olt) {
//			AnswerResponseModel am = new AnswerResponseModel();
//			int i = 0;
//			am.setQuestionId((Integer)oa[i++]);
//			am.setAnswer((Integer)oa[i++]);
//			System.out.println(am);
//			lt.add(am);
//		}	
//		System.out.println(lt);
//		return lt;
		List<AnswerResponseModel> answers = new ArrayList<>();
		for (AnswerRequestModel qIdModel : qstIds) {
			Question q = entityManager.unwrap(Session.class).load(Question.class, qIdModel.getQuestionId());
			AnswerResponseModel ans = new AnswerResponseModel();
			ans.setQuestionId(q.getQuestionId());
			ans.setAnswer(q.getAnswer());
//			System.out.println(ans);
			answers.add(ans);
		}
	//	System.out.println(answers);
		return answers;
	}

	@Override
	public List<Question> getQuestionbySubject(Integer subId) throws Exception{
		Subject subject = entityManager.unwrap(Session.class).load(Subject.class, subId);
		String jpql = "SElECT q.questionId, q.question, q.option1, q.option2, q.option3, q.option4 FROM Question AS q WHERE q.subject.subjectId= :sid";
		List<Object[]> olt = entityManager.unwrap(Session.class).createQuery(jpql, Object[].class)
				.setParameter("sid", subject.getSubjectId()).getResultList();
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

}