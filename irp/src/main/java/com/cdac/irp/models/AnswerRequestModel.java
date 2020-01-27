package com.cdac.irp.models;

public class AnswerRequestModel {
	Integer questionId;

	public AnswerRequestModel() {
		System.out.println("in answer request model");

	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "AnswerRequestModel [questionId=" + questionId + "]";
	}
	
	

}
