package com.cdac.irp.service;

import com.cdac.irp.pojos.Feedback;

public interface IFeedbackService {
	Feedback getFeedback(int prn, int facultyId);
	Feedback addFeedback(Feedback f);
}
