package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.models.QuestionRequestModel;
import com.cdac.irp.models.QuestionResponseModel;
import com.cdac.irp.pojos.Question;

public interface IQuizService {
	List<QuestionResponseModel> getTenQuestionList();
	List<AnswerResponseModel> getAnswersList(List<AnswerRequestModel> qstIds);
	List<QuestionResponseModel> getQuestionsBySubject(Integer subId);
	Question putQuestion(QuestionRequestModel qst);
}
