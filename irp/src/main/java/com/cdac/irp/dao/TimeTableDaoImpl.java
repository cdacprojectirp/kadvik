package com.cdac.irp.dao;


import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.Course;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.pojos.TimeTable;

@Repository
public class TimeTableDaoImpl implements ITimeTableDao
{
	
		@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TimeTable> getTimeTable(Integer data)
	{
		System.out.print(data);
		Student s = entityManager.unwrap(Session.class).load(Student.class,data);
		
		Course couId=s.getCourse();
		
		String jpql1 = "select t from TimeTable t where t.courseId=:cId";
		
		return entityManager.unwrap(Session.class).createQuery(jpql1, TimeTable.class).
				setParameter("cId", couId).getResultList();
	}

}
