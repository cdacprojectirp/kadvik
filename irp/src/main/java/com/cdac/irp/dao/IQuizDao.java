package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.AnswerModel;
import com.cdac.irp.pojos.Question;

public interface IQuizDao {
	//crud
	void setQuestion(Question q, int subId);
	
	List<Question> getQuestionList();
	
	List<AnswerModel> getAnswerList();
	
}
