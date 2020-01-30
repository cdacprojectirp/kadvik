package com.cdac.irp.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.irp.models.CommentsModel;
import com.cdac.irp.models.CommentsResponseModel;

public interface ICommentService {

	public void postInsert(@RequestBody CommentsModel c);
	public List<CommentsResponseModel> getFirstThreeComments(@RequestParam Integer postId);
	public List<CommentsResponseModel> getAllComments(@RequestParam Integer postId);
}
