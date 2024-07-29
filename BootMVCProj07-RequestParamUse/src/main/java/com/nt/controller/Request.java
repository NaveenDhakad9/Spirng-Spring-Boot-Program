package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Request {
   
	@GetMapping("/data")
	public String requestParam(@RequestParam("sno") int sno,@RequestParam("sname") String name ) {
		System.out.println(sno+"...."+name);
		return "show_result";
	}
	
}
