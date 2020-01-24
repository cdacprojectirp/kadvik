package com.cdac.irp.models;

public class AnswerResponseModel {
	Integer questionId;
	Integer answer;

	public AnswerResponseModel() {
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

	@Override
	public String toString() {
		return "AnswerResponseModel [questionId=" + questionId + ", answer=" + answer + "]";
	}
	
	

}
