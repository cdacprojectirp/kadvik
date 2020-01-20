package com.cdac.irp.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cdac.irp.pojos.Faculty;

public class FacultyDaoImpl implements IFacultyDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	public Faculty getfaculty(int id) {
		String jpql = "select f from Faculty f where id=:id";
		return entityManager.unwrap(Session.class).createQuery(jpql, Faculty.class).getSingleResult();
	}

	@Override
	public void setFaculty(Faculty f) {
		// TODO Auto-generated method stub

	}

}
