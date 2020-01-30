package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.ResultRequestModel;
import com.cdac.irp.pojos.Result;
import com.cdac.irp.pojos.Student;

public interface IResultService {

	void submitResult(ResultRequestModel result);

	List<Student> getTopperBySubject(Integer subjectId);

	Student getTopperByCourse(Integer courseId);

	List<Result> getResultlist(Integer subjectId);

	List<Result> getResultsByPrn(Integer prn);
}
