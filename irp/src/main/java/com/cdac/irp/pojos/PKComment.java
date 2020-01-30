package com.cdac.irp.pojos;

import java.io.Serializable;

public class PKComment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	//A Comment has a composite key of PRN + Post Id.
	private Integer prn;
	private Integer postId;
	
	public PKComment() {
		super();
		
	}

	
	public PKComment(Integer prn, Integer postId) {
		super();
		this.prn = prn;
		this.postId = postId;
	}


	public Integer getPrn() {
		return prn;
	}
	public void setPrn(Integer prn) {
		this.prn = prn;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
