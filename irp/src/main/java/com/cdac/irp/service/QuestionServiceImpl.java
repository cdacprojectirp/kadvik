package com.cdac.irp.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.IQuestionDao;
import com.cdac.irp.pojos.Question;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	private IQuestionDao qnDao;

	@Override
	public List<Question> getTenQuestionList(/* add course id parameter later on and student id for randomizer seed */) {
		List<Question> qts = qnDao.getQuestionList();
		Collections.shuffle(qts);
		//return qts.subList(0, 10);
		return qts;
	}

	@Override
	public List<Integer> getAnswersList() {
		// TODO Auto-generated method stub
		return null;
	}

}
