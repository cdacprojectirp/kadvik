package com.cdac.irp.dao;



import java.util.List;

import com.cdac.irp.models.PostModel;
import com.cdac.irp.models.PostsModelResponse;
import com.cdac.irp.pojos.Posts;

public interface IPostsDao  {

	public void postInsert(PostModel p)throws Exception;
	
	public List<PostsModelResponse> getFirstThreePosts()throws Exception;
	
	public List<PostsModelResponse> getAllPosts()throws Exception;
}
