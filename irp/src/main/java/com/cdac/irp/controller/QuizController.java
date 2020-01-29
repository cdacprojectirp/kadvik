package com.cdac.irp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.AnswerRequestModel;
import com.cdac.irp.models.AnswerResponseModel;
import com.cdac.irp.models.QuestionRequestModel;
import com.cdac.irp.models.QuestionResponseModel;
import com.cdac.irp.models.SubjectRequestModel;
import com.cdac.irp.service.IQuizService;

@RestController
@CrossOrigin
@RequestMapping("/api/exam")
public class QuizController {

	@Autowired
	private IQuizService service;

	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}

	@GetMapping("/quiz")
	public List<QuestionResponseModel> getExamQuestions() {
		return service.getTenQuestionList();
	}


	@PostMapping("/quiz/subject")
	public List<QuestionResponseModel> getExamQuestionsBySubject(@RequestBody SubjectRequestModel _request) {
		return service.getQuestionsBySubject(_request.getSubjectId());
	}
	
	
	@PostMapping("/answers")
	public List<AnswerResponseModel> getExamAnswers(@RequestBody List<AnswerRequestModel> qstIds) {
		return service.getAnswersList(qstIds);
	}
	
	@PostMapping("/question")
	public void putExamQuestion(@RequestBody QuestionRequestModel _request)
	{
		
	}

}
