package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.StudentPrnModel;
import com.cdac.irp.pojos.NoticeBoard;
import com.cdac.irp.service.INoticeBoard;

@RestController
@CrossOrigin
@RequestMapping("/api/noticeboard")
public class NoticeBoardController {

	@Autowired
	private INoticeBoard service;

	@GetMapping("/getnoticeboard")
	public List<NoticeBoard> getNoticeBoard(@RequestParam Integer page) {
		try {
			return service.getNoticeBoard(page);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
