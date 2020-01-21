package com.cdac.irp.models;

public class QuestionModel {

	private Integer questionId;
	private String question;
	private String[] options;

	public QuestionModel() {
		System.out.println("in question model");
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

}
