package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showfrom(@ModelAttribute("stud") Student st) {
		return "student_register";
	}
	
	@PostMapping("/register")
	public String processStudent(Map<String,Object> map,@ModelAttribute("stud") Student st ) {
		String grade = null;
		if(st.getAvg()>=75) {
			grade="First Class with Dist";
		}
		else if(st.getAvg()>=60) {
			grade = "First Class";
		}
		else if(st.getAvg()>=50) {
			grade = "Second Class";
		}
		else if(st.getAvg()>=35) {
			grade = "Third Class";
		}
		else {
			grade = "Fail";
		}
		
		map.put("result", grade);
		
		return "show_result";
	}

}
