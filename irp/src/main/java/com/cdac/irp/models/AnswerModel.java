package com.cdac.irp.models;

public class AnswerModel {
	Integer questionId;
	Integer answer;

	public AnswerModel() {
		System.out.println("in answer model");
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getAnswer() {
		return answer;
	}

	public void setAnswer(Integer answer) {
		this.answer = answer;
	}

}
