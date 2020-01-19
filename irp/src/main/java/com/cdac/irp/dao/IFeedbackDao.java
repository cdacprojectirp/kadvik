package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.pojos.Feedback;

public interface IFeedbackDao {
	
	Feedback getFeedback(int prn, int facultyId);
	Feedback addFeedback(Feedback f);

}
