package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.QuestionModel;

public interface IQuestionService {
	List<QuestionModel> getTenQuestionList();
	List<Integer>getAnswersList();
}
