package com.cdac.irp.models;

public class QuestionModel {

	private Integer questionId;
	private String question;
	private String[] option;

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

	public String[] getOption() {
		return option;
	}

	public void setOption(String[] option) {
		this.option = option;
	}

}
