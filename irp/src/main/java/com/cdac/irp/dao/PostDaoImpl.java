package com.cdac.irp.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.PostModel;
import com.cdac.irp.models.PostsModelResponse;
import com.cdac.irp.pojos.Posts;
import com.cdac.irp.pojos.Student;

@Repository
@Transactional
public class PostDaoImpl implements IPostsDao  {

	@Autowired
	private EntityManager entityManager;

	@Override //A post can be inserted with this method. Every Post needs  prn,text.
	public void postInsert(PostModel p) 
	{	
		Integer prn=p.getPrn();
		String text = p.getPostText();
		Student student = entityManager.unwrap(Session.class).load(Student.class, prn);
		//System.out.println(prn);
		//System.out.println(text);
		String jpql = "Insert into posts (date,post_text,time,prn)values(?,?,?,?)";
		entityManager.createNativeQuery(jpql).setParameter(1, LocalDate.now()).setParameter(2, text).setParameter(3,LocalTime.now()).setParameter(4,student).executeUpdate();
	}
 
	@Override // List of posts, limited to 3.
	public List<PostsModelResponse> getFirstThreePosts() {
	//	System.out.println("in ctr");
		List<Posts> list = new ArrayList<Posts>();
		String jpql = "Select p from Posts p ORDER BY p.postId DESC";
		List<PostsModelResponse> postsmodel = new ArrayList<PostsModelResponse>();
		list= entityManager.unwrap(Session.class).createQuery(jpql, Posts.class).setMaxResults(3).getResultList();
		for(Posts p:list)
		{
			postsmodel.add(new PostsModelResponse(p.getPostId(),p.getPostText(),p.getStud().getFirstName(),p.getStud().getLastName(),p.getDate(),p.getTime()));
		}
		return postsmodel;
	}
	
	@Override //All the posts are returned.
	public List<PostsModelResponse> getAllPosts() {
//		System.out.println("in ctr");
		List<Posts> list = new ArrayList<Posts>();
		String jpql = "Select p from Posts p";
		List<PostsModelResponse> postsmodel = new ArrayList<PostsModelResponse>();
		list= entityManager.unwrap(Session.class).createQuery(jpql, Posts.class).getResultList();
		Collections.reverse(list); 
		for(Posts p:list)
		{
			postsmodel.add(new PostsModelResponse(p.getPostId(),p.getPostText(),p.getStud().getFirstName(),p.getStud().getLastName(),p.getDate(),p.getTime()));
		}
		return postsmodel;
	}
}
