package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.dao.ICommentsDao;
import com.cdac.irp.dao.IPostsDao;
import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;
import com.cdac.irp.models.PostModel;
import com.cdac.irp.pojos.Comments;
import com.cdac.irp.pojos.Posts;
import com.cdac.irp.service.ICommentService;

@RestController
@CrossOrigin
@RequestMapping("/api/comments")

public class CommentsController {
	@Autowired
	private ICommentService service;

	@PostMapping("/addcomments")
	public void postInsert(@RequestBody CommentsModel c)
	{
//		System.out.println(c.toString());  For testing purpose, these will be null if something goes wrong.
//		System.out.println("------");
//		System.out.println(c.getPrn());
//		System.out.println("------");
//		System.out.println(c.getCommentText());
		service.postInsert(c);;
	}
	
	@GetMapping("/getFirstThree") //The first three comments will be sent. 
	public List<CommentsResponseModel> getFirstThreeComments(@RequestParam Integer postId)
	{
		if(service.getFirstThreeComments(postId)==null)
		{
			return null;
		}
		else
			return service.getFirstThreeComments(postId);
	}
	@GetMapping("/getAllComments") //All the comments can be sent.
	public List<CommentsResponseModel> getAllComments(@RequestParam Integer postId)
	{
		
		if(service.getAllComments(postId)==null)
		{
			return null;
		}
		else
			return service.getAllComments(postId);
	}

	
}
