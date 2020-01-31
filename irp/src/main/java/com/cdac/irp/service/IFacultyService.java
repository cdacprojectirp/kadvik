package com.cdac.irp.service;

import java.util.List;

import com.cdac.irp.models.FacultyGetAllResponseModel;
import com.cdac.irp.models.FacultyGetResponseModel;

public interface IFacultyService {

	List<FacultyGetAllResponseModel> getAll() throws Exception;
	
	List<FacultyGetResponseModel> getFacultyListByStudentPrn(Integer prn) throws Exception;
}
