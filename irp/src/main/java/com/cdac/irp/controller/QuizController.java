package com.cdac.irp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.QuestionModel;
import com.cdac.irp.pojos.Question;
import com.cdac.irp.service.IQuestionService;

@RestController
@CrossOrigin
@RequestMapping("/api/exam")
public class QuizController {

	@Autowired
	private IQuestionService service;

	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}

	@GetMapping("/quiz")
	public List<Question> getExamQuestions() {
		return service.getTenQuestionList();
	}

	public void trialfun() {
	}

}
