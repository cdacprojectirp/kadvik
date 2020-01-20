package com.cdac.irp.dao;

import com.cdac.irp.pojos.Faculty;

public interface IFacultyDao {
	// CRUD
	Faculty getfaculty(int id);

	void setFaculty(Faculty f);

}
