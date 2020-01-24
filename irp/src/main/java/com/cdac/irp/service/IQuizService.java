package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.models.QuestionModel;

public interface IQuizService {
	List<QuestionModel> getTenQuestionList();
	List<AnswerResponseModel> getAnswersList(List<AnswerRequestModel> qstIds);
}
