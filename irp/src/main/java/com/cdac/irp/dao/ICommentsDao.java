package com.cdac.irp.dao;

import java.util.List;

import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;
import com.cdac.irp.pojos.Comments;

public interface ICommentsDao {

	public void setComments(CommentsModel c) throws Exception;

	List<CommentsResponseModel> getFirstThreeComments(Integer postId) throws Exception;
	
	List<CommentsResponseModel> getAllComments(Integer postId) throws Exception;
	
}
