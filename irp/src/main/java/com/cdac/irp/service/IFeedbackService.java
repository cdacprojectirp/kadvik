package com.cdac.irp.service;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.pojos.Feedback;

public interface IFeedbackService {
	Feedback getFeedback(int prn, int facultyId);
	FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request);
}
