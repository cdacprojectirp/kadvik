package com.cdac.irp.service;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.models.FeedbackGetResponseModel;

public interface IFeedbackService {
	FeedbackGetResponseModel getFeedback(int prn, int facultyId)throws Exception;
	FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request)throws Exception;
}
