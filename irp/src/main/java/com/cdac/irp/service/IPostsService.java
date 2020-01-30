package com.cdac.irp.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.cdac.irp.models.PostModel;
import com.cdac.irp.models.PostsModelResponse;

public interface IPostsService {

	
	public void postInsert(@RequestBody PostModel p);
	public List<PostsModelResponse> getFirstThreePosts();
	public List<PostsModelResponse> getAllPosts();
}
