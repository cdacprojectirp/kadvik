package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.AnswerModel;
import com.cdac.irp.models.QuestionModel;

public interface IQuizService {
	List<QuestionModel> getTenQuestionList();
	List<AnswerModel> getAnswersList();
}
