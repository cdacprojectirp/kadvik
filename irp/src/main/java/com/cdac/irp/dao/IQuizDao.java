package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.pojos.Question;

public interface IQuizDao {
	//crud
	void setQuestion(Question q, int subId) throws Exception;
	
	List<Question> getQuestionList() throws Exception;
	
	List<AnswerResponseModel> getAnswerList(List<AnswerRequestModel> qstIds) throws Exception;

	List<Question> getQuestionbySubject(Integer subId) throws Exception;
	
}
