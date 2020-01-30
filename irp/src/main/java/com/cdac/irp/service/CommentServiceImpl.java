package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.irp.dao.ICommentsDao;
import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;
@Service
public class CommentServiceImpl implements ICommentService{
	@Autowired
	private ICommentsDao dao;


	public void postInsert(@RequestBody CommentsModel c)
	{
		dao.setComments(c);
	}
	
	public List<CommentsResponseModel> getFirstThreeComments(@RequestParam Integer postId)
	{
		if(dao.getFirstThreeComments(postId)==null)
		{
			return null;
		}
		else
			return dao.getFirstThreeComments(postId);
	}

	public List<CommentsResponseModel> getAllComments(@RequestParam Integer postId)
	{
		
		if(dao.getAllComments(postId)==null)
		{
			return null;
		}
		else
			return dao.getAllComments(postId);
	}

}
