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
		service.submitResult(_reqResult);
	}

	@GetMapping("/average")
	public Float getAverageResult(Integer subjectId) {
		int sum = 0;
		float avg = 0;
		List<Result> results = service.getResultlist(subjectId);
		for (Result result : results) {
			sum += result.getMarks();
		}
		avg = (float) sum / (results.size());
		return avg;
	}

	@GetMapping("/list")
	public List<Result> getResults(@RequestParam Integer subjectId) {
		List<Result> results = service.getResultlist(subjectId);
		return results;
	}

	@GetMapping("/topper")
	public List<Student> getTopper(Integer subjectId) {
		return service.getTopperBySubject(subjectId);
	}

	@GetMapping("/overalltopper")
	public Student getCourseTopper(Integer courseId) {
		service.getTopperByCourse(courseId);
		return null;
	}

	@PostMapping("/report")
	public List<Result> getStudentReport(@RequestBody StudentPrnModel student) {
		return service.getResultsByPrn(student.getPrn());
	}

	
}
