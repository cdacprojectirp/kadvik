package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.pojos.Question;

public interface IQuizDao {
	//crud
	void setQuestion(Question q, int subId);
	
	List<Question> getQuestionList();
	
	List<AnswerResponseModel> getAnswerList(List<AnswerRequestModel> qstIds);

	List<Question> getQuestionbySubject(Integer subId);
	
}
