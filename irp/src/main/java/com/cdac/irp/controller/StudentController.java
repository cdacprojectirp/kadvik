package com.cdac.irp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

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

import com.cdac.irp.MD5;
import com.cdac.irp.models.StudentAuthenticateRequestModel;
import com.cdac.irp.models.StudentRegisterRequestModel;
import com.cdac.irp.pojos.Student;
import com.cdac.irp.service.IStudentService;

@RestController
@CrossOrigin
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private IStudentService service;

	@PostConstruct
	public void init() {
		System.out.println("in init " + service);
	}

	@GetMapping("/getall")
	public List<Student> getAll() {
		return service.getAllStudents();
	}
	
	@GetMapping("/getstudentbyprn")
	public Student getStudent(@RequestParam Integer prn){
		return service.getStudentByPrn(prn);
	}

	@PostMapping("/authenticate")
	public ResponseEntity<?> Authenticate(@RequestBody StudentAuthenticateRequestModel _s) {
		Integer prn = service.Authenticate(_s.getEmail(), MD5.getMd5(_s.getPassword()));
		if (prn == null)
			return new ResponseEntity<Boolean>(false,HttpStatus.OK);
		return new ResponseEntity<Integer>(prn, HttpStatus.OK);
	}

	@PostMapping("/register")
	public StudentRegisterRequestModel Register(@RequestBody StudentRegisterRequestModel _student) {
		return service.RegisterStudent(_student);
	}
}
