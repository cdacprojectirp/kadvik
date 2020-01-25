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
	public List<NoticeBoard> getNoticeBoard(Integer prn) {
		System.out.println(prn);
		Student s = entityManager.unwrap(Session.class).load(Student.class,prn);
		
		Integer couId = s.getCourse().getCourseId();
		
		String jpql = "SELECT n FROM NoticeBoard n WHERE n.course.courseId = :cid OR n.course.courseId = 5";
		
		List<NoticeBoard> list= entityManager.unwrap(Session.class).createQuery(jpql, NoticeBoard.class).setParameter("cid",couId).getResultList();
		
		return list;


	}

	
	
}
