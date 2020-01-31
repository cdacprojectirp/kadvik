package com.cdac.irp.dao;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.FeedbackGetResponseModel;
import com.cdac.irp.models.TimeTableUpdateRequestModel;
import com.cdac.irp.pojos.Course;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.pojos.TimeTable;

@Repository
public class TimeTableDaoImpl implements ITimeTableDao
{
	
		@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<TimeTable> getTimeTable(Integer data)throws Exception
	{
		System.out.print(data);
		Student s = entityManager.unwrap(Session.class).load(Student.class,data);
		
		Course couId=s.getCourse();
		
		String jpql1 = "select t from TimeTable t where t.courseId=:cId";
		
		return entityManager.unwrap(Session.class).createQuery(jpql1, TimeTable.class).
				setParameter("cId", couId).getResultList();
	}

	@Override
	public List<TimeTable> getTimeTableAdmin(Integer courseId)throws Exception
	{
//		System.out.println("in timetable dao"+courseId);
		Course c = entityManager.unwrap(Session.class).load(Course.class,courseId);
		String jpql1 = "select t from TimeTable t where t.courseId=:cId";
		
		
		
		return entityManager.unwrap(Session.class).createQuery(jpql1, TimeTable.class).
				setParameter("cId", c).getResultList();
	}
	
	@Override
	public List<TimeTableUpdateRequestModel> updateTimeTable(List<TimeTableUpdateRequestModel> _request) throws Exception{
		List<TimeTableUpdateRequestModel> list = new ArrayList<TimeTableUpdateRequestModel>();
		for(TimeTableUpdateRequestModel timeTable:_request) {
	//		System.out.println(timeTable.getCourseId());
			String jpql = "select t from TimeTable t where t.courseId.courseId=:cId and t.day=:day";
			TimeTable timeSheet=entityManager.unwrap(Session.class).createQuery(jpql, TimeTable.class).setParameter("cId", timeTable.getCourseId()).
					setParameter("day", timeTable.getDay()).getSingleResult();
	//		System.out.println(timeSheet);
			timeSheet.setPeriodA(timeTable.getPeriodA());
			timeSheet.setPeriodB(timeTable.getPeriodB());
			timeSheet.setPeriodC(timeTable.getPeriodC());
			list.add(new TimeTableUpdateRequestModel(timeSheet.getDay(),timeSheet.getPeriodA(),
					timeSheet.getPeriodB(),timeSheet.getPeriodC(),timeTable.getCourseId()));
		}

		return list;
	}

}
