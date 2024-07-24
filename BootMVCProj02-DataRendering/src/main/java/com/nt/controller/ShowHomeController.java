package com.nt.controller;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {

	// @RequestMapping("/home")
	// public String showHome() {
	// //return LVN
	// return "welcome";
	// }

	// @RequestMapping("/")
	// public String showHome() {
	// //return LVN
	// return "welcome";
	// }

	// @RequestMapping("/")
	// public String showHome(Map<String, Object> map) {
	// System.out.println("Shared Memory obj's class::"+map.getClass());
	// map.put("attr1", "Value1");
	// map.put("sysDate",new Date());
	// // return LVN
	// return "welcome";
	// }

	// @RequestMapping("/")
	// public String showHome(Model model) {
	// System.out.println("Shared Memory obj's class::"+model.getClass());
	// model.addAttribute("attr1", "Value1");
	// model.addAttribute("sysDate",new Date());
	// // return LVN
	// return "welcome";
	// }

//	@RequestMapping("/")
//	public String showHome(ModelMap model) {
//		System.out.println("Shared Memory obj's class::" + model.getClass());
//		model.put("attr1", "Value1");
//		model.put("sysDate", new Date());
//		// return LVN
//		return "welcome";
//	}

//	@RequestMapping("/rendering")
//	public Model showHome() {
//		Model model=new BindingAwareModelMap();
//		
//		System.out.println("Shared Memory obj's class::" + model.getClass());
//		
//		model.addAttribute("attr1", "Value1");
//		model.addAttribute("sysDate", new Date());
//		// return LVN
//		return model;
//	}
	
//	@RequestMapping("/rendering")
//	public String Home() {
//		System.out.println("homeController::Home()");
//		return "forward:report";
//	}
//	
//	@RequestMapping("/report")
//	public String showHome() {
//		System.out.println("showHomeController::showHome()");
//		return "welcome";
//	}
	
//	@RequestMapping("/rendering")
//	public String Home() {
//		System.out.println("homeController::Home()");
//		return "redirect:report";
//	}
//	
//	@RequestMapping("/report")
//	public String showHome() {
//		System.out.println("showHomeController::showHome()");
//		return "welcome";
//	}
	
	@RequestMapping("/rendering")
	public String showHome(HttpServletResponse res) throws Exception {
		System.out.println("showHomeController::showHome()");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		return "welcome";
	}
	
	
	
	
}
