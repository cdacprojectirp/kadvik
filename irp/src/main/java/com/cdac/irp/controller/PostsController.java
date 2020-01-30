package com.cdac.irp.controller;

import com.cdac.irp.dao.IPostsDao;
import com.cdac.irp.models.PostModel;
import com.cdac.irp.models.PostsModelResponse;
import com.cdac.irp.pojos.*;
import com.cdac.irp.service.IPostsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/posts")
public class PostsController {
	@Autowired
	private IPostsService service;
	
	@PostMapping("/addposts")
	public void postInsert(@RequestBody PostModel p)
	{
		service.postInsert(p);
	}
	
	@GetMapping("/getFirstThreePosts")
	public List<PostsModelResponse> getFirstThreePosts()
	{
		return service.getFirstThreePosts();
	}
	
	@GetMapping("/getAllPosts")
	public List<PostsModelResponse> getAllPosts()
	{
		return service.getAllPosts();
	}

}
