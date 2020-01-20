package com.cdac.irp.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.IQuestionDao;
import com.cdac.irp.models.QuestionModel;
import com.cdac.irp.pojos.Question;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private IQuestionDao qnDao;

	@Override
	public List<QuestionModel> getTenQuestionList(/* add course id parameter later on and student id for randomizer seed */) {
		List<Question> qts = qnDao.getQuestionList();
		Collections.shuffle(qts);
		//return qts.subList(0, 10);
		List<QuestionModel> lt= new ArrayList<>();
		for (Question question : qts) {
			QuestionModel qm= new QuestionModel();
			qm.setQuestionId(question.getQuestionId());
			qm.setQuestion(question.getQuestion());
			String[] o= {question.getOption1(),question.getOption2(),question.getOption3(),question.getOption4()};
			qm.setOption(o);
			lt.add(qm);
		}
		return lt;
	}

	@Override
	public List<Integer> getAnswersList() {
		// TODO Auto-generated method stub
		return null;
	}

}
