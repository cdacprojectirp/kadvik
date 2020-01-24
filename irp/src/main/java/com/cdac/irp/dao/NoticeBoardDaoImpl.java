package com.cdac.irp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.pojos.NoticeBoard;


@Repository
public class NoticeBoardDaoImpl implements INoticeBoardDao {

	@Autowired
	private EntityManager entityManager;
	
	
	@Override
	public List<NoticeBoard> getNoticeBoard() {

		String jpql = "select n from NoticeBoard n  ";
		
		List<NoticeBoard> list= entityManager.unwrap(Session.class).createQuery(jpql, NoticeBoard.class).getResultList();
		
		System.out.println(list);
		return list;


	}

	
	
}
