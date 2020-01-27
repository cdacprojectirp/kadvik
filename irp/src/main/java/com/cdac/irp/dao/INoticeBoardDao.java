package com.cdac.irp.dao;

import java.util.List;
import com.cdac.irp.pojos.NoticeBoard;

public interface INoticeBoardDao {
	
		List<NoticeBoard> getNoticeBoard(Integer Data);
}
