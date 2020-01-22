package com.cdac.irp.dao;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.models.FeedbackGetResponseModel;

public interface IFeedbackDao {
	
	FeedbackGetResponseModel getFeedback(int prn, int facultyId);
	FeedbackAddFeedbackRequestModel addFeedback(FeedbackAddFeedbackRequestModel _request);

}
