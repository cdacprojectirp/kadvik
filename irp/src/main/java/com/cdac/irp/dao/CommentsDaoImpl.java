package com.cdac.irp.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;
import com.cdac.irp.pojos.Comments;
import com.cdac.irp.pojos.Faculty;
import com.cdac.irp.pojos.Feedback;
import com.cdac.irp.pojos.PKComment;
import com.cdac.irp.pojos.PKStudentFaculty;
import com.cdac.irp.pojos.Posts;
import com.cdac.irp.pojos.Student;

@Repository
@Transactional
public class CommentsDaoImpl implements ICommentsDao{

	@Autowired
	private EntityManager entityManager;
	
	@Override //this will set the comment as per the PRN and Post ID. 
	public void setComments(CommentsModel c)throws Exception {

		Integer prn = c.getPrn();
		Integer postId=c.getPostId();
		String text = c.getCommentText();
		//System.out.println("prn"+prn);
		//System.out.println("postID"+postId);
		Student student = entityManager.unwrap(Session.class).load(Student.class, prn);
		Posts post = entityManager.unwrap(Session.class).load(Posts.class, postId);
		PKComment pksf= new PKComment(prn, postId);
		String jpql = "Insert into comments (comment_text,date,time,post_id,prn)values(?,?,?,?,?)";
		entityManager.createNativeQuery(jpql).setParameter(1, text).setParameter(2,LocalDate.now()).setParameter(3,LocalTime.now()).setParameter(4,post).setParameter(5, student).executeUpdate();
		}
	
	@Override //This will get only the first three comments converted to Comments M
	public List<CommentsResponseModel> getFirstThreeComments(Integer postID) throws Exception{
		//System.out.println("in ctr");
		Posts p = entityManager.unwrap(Session.class).load(Posts.class,postID);		
		String jpql = "Select c from Comments c where c.post=:pId ";
		System.out.println("post id"+postID);
		List<CommentsResponseModel> commentsResponse = new ArrayList<CommentsResponseModel>(); 
		List<Comments> comments=entityManager.unwrap(Session.class).createQuery(jpql, Comments.class).setParameter("pId",p).setMaxResults(3).getResultList();
		for(Comments c:comments)
		{	
			commentsResponse.add(new CommentsResponseModel(c.getCommentText(),c.getPost().getPostId(),c.getStud().getPrn(),c.getStud().getFirstName(),c.getStud().getLastName(),c.getDate(),c.getTime()));
		}
		return commentsResponse;
	}
	
	@Override //This will get all the comments converted to Comments M
	public List<CommentsResponseModel> getAllComments(Integer postID) throws Exception{
		//System.out.println("in ctr");
		Posts p = entityManager.unwrap(Session.class).load(Posts.class,postID);		
		String jpql = "Select c from Comments c where c.post=:pId ";
		//System.out.println("post id"+postID);
		List<CommentsResponseModel> commentsResponse = new ArrayList<CommentsResponseModel>(); 
		List<Comments> comments=entityManager.unwrap(Session.class).createQuery(jpql, Comments.class).setParameter("pId",p).getResultList();
		for(Comments c:comments)
		{	
			commentsResponse.add(new CommentsResponseModel(c.getCommentText(),c.getPost().getPostId(),c.getStud().getPrn(),c.getStud().getFirstName(),c.getStud().getLastName(),c.getDate(),c.getTime()));
		}
		return commentsResponse;
	}
		
	}

