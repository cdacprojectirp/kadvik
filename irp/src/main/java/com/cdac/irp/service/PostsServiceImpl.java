package com.cdac.irp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.irp.dao.IPostsDao;
import com.cdac.irp.models.PostModel;
import com.cdac.irp.models.PostsModelResponse;

@Service
public class PostsServiceImpl implements IPostsService{
	@Autowired
	private IPostsDao dao;
	public void postInsert(@RequestBody PostModel p)
	{
		dao.postInsert(p);
	}
	
	public List<PostsModelResponse> getFirstThreePosts()
	{
		return dao.getFirstThreePosts();
	}
	
	public List<PostsModelResponse> getAllPosts()
	{
		return dao.getAllPosts();
	}
}
