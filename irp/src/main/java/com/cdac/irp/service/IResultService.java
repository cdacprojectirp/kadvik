package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.ResultRequestModel;
import com.cdac.irp.models.ResultResponseModel;
import com.cdac.irp.pojos.Result;
import com.cdac.irp.pojos.Student;

public interface IResultService {

	void submitResult(ResultRequestModel result) throws Exception;

	List<Student> getTopperBySubject(Integer subjectId) throws Exception;

	Student getTopperByCourse(Integer courseId) throws Exception;

	List<Result> getResultlist(Integer subjectId) throws Exception;

	List<ResultResponseModel> getResultsByPrn(Integer prn) throws Exception;
}
