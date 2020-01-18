package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.pojos.Question;
import com.cdac.irp.service.IQuestionService;

@RestController
@CrossOrigin
@RequestMapping("/api/exam")
public class QuizController {

	@Autowired
	private IQuestionService service;

	public void init() {
		System.out.println("in init " + service);
	}

	public List<Question> getExamQuestions() {
		return service.getTenQuestionList();
	}

}
