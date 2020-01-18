package com.cdac.irp.dao;

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
		String jpql = "select q from Question q";
		return entityManager.unwrap(Session.class).createQuery(jpql, Question.class).getResultList();
	}

}