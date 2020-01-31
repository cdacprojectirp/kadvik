package com.cdac.irp.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;

public interface ICommentService {

	public void postInsert(@RequestBody CommentsModel c) throws Exception;
	public List<CommentsResponseModel> getFirstThreeComments(@RequestParam Integer postId)throws Exception;
	public List<CommentsResponseModel> getAllComments(@RequestParam Integer postId)throws Exception;
}
