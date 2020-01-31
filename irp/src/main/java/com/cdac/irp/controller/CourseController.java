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
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.CourseGetResponseModel;
import com.cdac.irp.models.StudentPrnModel;
import com.cdac.irp.pojos.Course;
import com.cdac.irp.service.ICourseService;

@RestController
@CrossOrigin
@RequestMapping("/api/course")
public class CourseController {

	@Autowired
	private ICourseService service;

	@GetMapping("/getAllCourse")
	public ResponseEntity<?> getAllCourse() {
		try {
			List<CourseGetResponseModel> f = service.getAllCourse();
			if (f == null) {
				return null;
			}
			return new ResponseEntity<List<CourseGetResponseModel>>(f, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@PostMapping("/getCourseByStudentPrn")
	public Course getCourseByStudentPrn(@RequestBody StudentPrnModel _request) {
		try {
			return service.getCourseByStudentPrn(_request.getPrn());
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
