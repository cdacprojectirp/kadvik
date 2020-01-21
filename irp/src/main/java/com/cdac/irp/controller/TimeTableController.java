package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cdac.irp.pojos.TimeTable;
import com.cdac.irp.service.ITimeTable;

@RestController
@CrossOrigin
@RequestMapping("/api/student")
public class TimeTableController {
	@Autowired
	private ITimeTable service;
	@GetMapping("/getTimeTable")
	public List<TimeTable> getTimeTable(@RequestParam Integer page) {
		return service.getTimeTable(page);
	}

}
