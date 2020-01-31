package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.FacultyGetAllResponseModel;
import com.cdac.irp.models.FacultyGetResponseModel;
import com.cdac.irp.pojos.Faculty;

public interface IFacultyDao {
	// CRUD
	Faculty getfaculty(int id);

	List<FacultyGetAllResponseModel> getAll();
	
	List<FacultyGetResponseModel> getFacultyListByStudentPrn(Integer prn);

}
