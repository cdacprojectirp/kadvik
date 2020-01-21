package com.cdac.irp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.irp.models.FeedbackAddFeedbackRequestModel;
import com.cdac.irp.models.FeedbackGetFeedbackRequestModel;
import com.cdac.irp.pojos.Feedback;
import com.cdac.irp.service.IFeedbackService;

@RestController
@CrossOrigin
@RequestMapping("/api/feedback")
public class FeedbackController {
	
	@Autowired
	private IFeedbackService service;
	
	@GetMapping("/getFeedback")
	public ResponseEntity<?> getFeedback(@RequestBody FeedbackGetFeedbackRequestModel _request){
		Feedback f = service.getFeedback(_request.getPrn(), _request.getFacultyId());
		if(f==null) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		}
		return new ResponseEntity<Feedback>(f, HttpStatus.OK);
		
	}
	
	@PostMapping("/addFeedback")
	public ResponseEntity<?> addFeedback(@RequestBody FeedbackAddFeedbackRequestModel _request){
		try {
			return new ResponseEntity<FeedbackAddFeedbackRequestModel>(service.addFeedback(_request), HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

}
