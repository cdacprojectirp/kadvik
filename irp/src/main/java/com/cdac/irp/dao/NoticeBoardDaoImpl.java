package com.cdac.irp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.Course;
import com.cdac.irp.pojos.NoticeBoard;
import com.cdac.irp.pojos.Student;


@Repository
public class NoticeBoardDaoImpl implements INoticeBoardDao {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<NoticeBoard> getNoticeBoard(Integer prn) throws Exception{
		Student s = entityManager.unwrap(Session.class).load(Student.class,prn);
		
		Integer couId = s.getCourse().getCourseId();
		
		String course_jpql = "Select c from Course c where c.courseName='general'";
		
		Course c = entityManager.unwrap(Session.class).createQuery(course_jpql, Course.class).getSingleResult();
		
		Integer generalId = c.getCourseId();
		
		
		String jpql = "SELECT n FROM NoticeBoard n WHERE n.course.courseId = :cid OR n.course.courseId = :gId";
		
		List<NoticeBoard> list= entityManager.unwrap(Session.class).createQuery(jpql, NoticeBoard.class).setParameter("cid",couId).setParameter("gId",generalId).getResultList();
		
		return list;


	}

	
	
}
