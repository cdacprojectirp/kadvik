package com.cdac.irp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.StudentPrnModel;
import com.cdac.irp.pojos.Subject;
import com.cdac.irp.service.ISubjectService;

@RestController
@CrossOrigin
@RequestMapping("/api/subject")
public class SubjectController {
	
	@Autowired
	private ISubjectService service; 
	
	@PostMapping("/list")
	public List<Subject> getSubjectListByStudentPrn(@RequestBody StudentPrnModel _request){
		return service.getSubjectNames(_request.getPrn());
	}
}
