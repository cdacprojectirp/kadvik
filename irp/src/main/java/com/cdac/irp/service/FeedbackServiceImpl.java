package com.cdac.irp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdac.irp.dao.IFeedbackDao;
import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.pojos.Feedback;

@Service
@Transactional
public class FeedbackServiceImpl implements IFeedbackService {
	
	@Autowired
	private IFeedbackDao dao;

	@Override
	public Feedback getFeedback(int prn, int facultyId) {
		return dao.getFeedback(prn, facultyId);
	}

	@Override
	public FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request) {
		return dao.addFeedback(_request);
	}

}
