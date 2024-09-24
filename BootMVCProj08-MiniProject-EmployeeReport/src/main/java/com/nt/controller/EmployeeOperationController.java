package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeOperationController {
	@Autowired
	private IEmployeeMgmtService empservice;

	@GetMapping("/")
	public String showHome() {
		return "welcome";
	}

	@GetMapping("/report")
	public String showEmployeeReport(Map<String, Object> map) {
		Iterable<Employee> itEmp = empservice.getAllEmployees();
		map.put("empData", itEmp);
		return "show_report";

	}

	@GetMapping("/empAdd")
	public String showFromForSaveEmployee(@ModelAttribute("emp") Employee emp) {
		return "register_Employee";
	}

//    @PostMapping("/empAdd")  // Bad Practice
//    public String saveEmployee(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
//    	String msg=empservice.registerEmployee(emp);
//    	Iterable<Employee> itemps=empservice.getAllEmployees();
//    	
//    	map.put("resultMsg", msg);
//    	map.put("empData", itemps);
//    	
//    	return "show_report";
//    }

//  @PostMapping("/empAdd") //Bad Practice
//  public String saveEmployee(Map<String,Object> map,@ModelAttribute("emp") Employee emp) {
//  	String msg=empservice.registerEmployee(emp);
//  	map.put("resultMsg", msg);
//  	return "redirect:report";
//  }
//  

	//Best Among All
	@PostMapping("/empAdd") // Best Practice
	public String saveEmployee(RedirectAttributes ratt, @ModelAttribute("emp") Employee emp) {
		String msg = empservice.registerEmployee(emp);
		ratt.addFlashAttribute("resultMsg", msg);
		return "redirect:report";
	}
	
//	@PostMapping("/empAdd") // if you want to display the message repeatedly
//	public String saveEmployee(HttpSession ses, @ModelAttribute("emp") Employee emp) {
//		String msg = empservice.registerEmployee(emp);
//		ses.setAttribute("resultMsg", msg);
//		return "redirect:report";
//	}
	
	@GetMapping("/edit")
	public String showEditFormPage(@RequestParam("no") int no,@ModelAttribute("emp") Employee emp) {
		Employee emp1 = empservice.getEmployeeByNo(no);
		BeanUtils.copyProperties(emp1,emp);
		return "update_employee";
	}
	
	@PostMapping("/edit")
	public String editEmployee(RedirectAttributes rtt,@ModelAttribute("emp") Employee emp) {
		String msg=empservice.updateEmployee(emp);
		rtt.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(RedirectAttributes rtt,@RequestParam int no) {
		String msg = empservice.deleteEmployeeById(no);
		rtt.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
}
