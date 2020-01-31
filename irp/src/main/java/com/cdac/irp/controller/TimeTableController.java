package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.TimeTableUpdateRequestModel;
import com.cdac.irp.pojos.TimeTable;
import com.cdac.irp.service.ITimeTable;

@RestController
@CrossOrigin
@RequestMapping("/api/timetable")
public class TimeTableController {
	@Autowired
	private ITimeTable service;
	@GetMapping("/getTimeTable")
	public List<TimeTable> getTimeTable(@RequestParam Integer page) {
		return service.getTimeTable(page);
	}
	@GetMapping("/getTimeTableAdmin")
	public List<TimeTable> getTimeTableAdmin(@RequestParam Integer courseId) {
	//	System.out.println(courseId);
		return service.getTimeTableAdmin(courseId);
	}
	
	@PostMapping("/updateTimeTable")
	public ResponseEntity<?> updateTimetable(@RequestBody List<TimeTableUpdateRequestModel> _request){
		try {
			return new ResponseEntity<List<TimeTableUpdateRequestModel>>(service.updateTimeTable(_request),HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
