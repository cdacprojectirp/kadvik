package com.cdac.irp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.MD5;
import com.cdac.irp.models.StudentAuthenticateRequestModel;
import com.cdac.irp.service.IAdminService;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminController {

	@Autowired
	private IAdminService service;

	@PostMapping("/authenticate")
	public ResponseEntity<?> Authenticate(@RequestBody StudentAuthenticateRequestModel _request) {
		try {
			Boolean ret = service.Authenticate(_request.getEmail(), MD5.getMd5(_request.getPassword()));
			return new ResponseEntity<Boolean>(ret, HttpStatus.OK);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}

}
