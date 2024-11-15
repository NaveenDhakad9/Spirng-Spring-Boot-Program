package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageapi")
public class MessageRenderController {
 
	@GetMapping("/wish")
	public ResponseEntity<String> showMessage(){
		LocalDateTime ldt = LocalDateTime.now();
		
		String msg=null;
		int hour=ldt.getHour();
		if (hour<12) {
			msg="good Morning";
		}
		else if(hour<16) {
			msg="good Afternoon";
		}
		else if(hour<20) {
			msg="good evening";
		}
		else {
			msg="good night";
		}
		
		ResponseEntity<String> entity = new ResponseEntity<String>(msg,HttpStatus.OK);
		return entity;
	}
}
