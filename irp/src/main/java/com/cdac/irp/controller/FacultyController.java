package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.FacultyGetAllResponseModel;
import com.cdac.irp.models.FacultyGetResponseModel;
import com.cdac.irp.models.StudentPrnModel;
import com.cdac.irp.service.IFacultyService;

@RestController
@CrossOrigin
@RequestMapping("/api/faculty")
public class FacultyController {

	@Autowired
	IFacultyService service;

	@GetMapping("/getall")
	public List<FacultyGetAllResponseModel> getall() {
		try {
			return service.getAll();
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

	@PostMapping("/getlistbystudentprn")
	public List<FacultyGetResponseModel> getFacultyListByStudentPrn(@RequestBody StudentPrnModel _request) {
		try {
			return service.getFacultyListByStudentPrn(_request.getPrn());
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
