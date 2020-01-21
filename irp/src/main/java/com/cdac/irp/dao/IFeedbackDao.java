package com.cdac.irp.dao;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.pojos.Feedback;

public interface IFeedbackDao {
	
	Feedback getFeedback(int prn, int facultyId);
	FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request);

}
