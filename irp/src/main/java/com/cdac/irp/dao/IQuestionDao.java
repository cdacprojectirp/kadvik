package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.pojos.Question;

public interface IQuestionDao {
	//crud
	void setQuestion(Question q, int subId);
	
	List<Question> getQuestionList();
	
}
