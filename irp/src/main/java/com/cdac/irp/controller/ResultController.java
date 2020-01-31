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

import com.cdac.irp.models.ResultRequestModel;
import com.cdac.irp.models.ResultResponseModel;
import com.cdac.irp.models.StudentPrnModel;
import com.cdac.irp.pojos.Result;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.service.IResultService;

@RestController
@CrossOrigin
@RequestMapping("/api/result")
public class ResultController {

	@Autowired
	private IResultService service;

	@PostMapping("/submit")
	public void submitResult(@RequestBody ResultRequestModel _reqResult) {
		try {
			if(_reqResult.getSubjectId()!=0) {
				service.submitResult(_reqResult);
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@GetMapping("/average")
	public Float getAverageResult(Integer subjectId) {
		int sum = 0;
		float avg = 0;
		try {
			List<Result> results = service.getResultlist(subjectId);
			for (Result result : results) {
				sum += result.getMarks();
			}
			avg = (float) sum / (results.size());
			return avg;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@GetMapping("/list")
	public List<Result> getResults(@RequestParam Integer subjectId) {
		
		try {
			List<Result> results = service.getResultlist(subjectId);
			return results;
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@GetMapping("/topper")
	public List<Student> getTopper(Integer subjectId) {
		try {
			return service.getTopperBySubject(subjectId);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@GetMapping("/overalltopper")
	public Student getCourseTopper(Integer courseId) {
		try {
			service.getTopperByCourse(courseId);
			return null;//for later use
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@PostMapping("/report")
	public List<ResultResponseModel> getStudentReport(@RequestBody StudentPrnModel student) {
		try {
			return service.getResultsByPrn(student.getPrn());
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	
}
