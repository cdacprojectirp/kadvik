package com.cdac.irp.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.irp.dao.INoticeBoardDao;
import com.cdac.irp.pojos.NoticeBoard;

@Service
@Transactional
public class NoticeBoardServiceImpl implements INoticeBoard {
	
	@Autowired
	private INoticeBoardDao dao;
	
	@Override
	public List<NoticeBoard> getNoticeBoard(Integer Data) throws Exception{
//		System.out.println("in noticeboard service");
		return dao.getNoticeBoard(Data);
	}


}
