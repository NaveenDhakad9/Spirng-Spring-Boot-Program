package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller("empController")
public class EmployeeOperationController {

	@Autowired
	private IEmployeeMgmtService empService;
	
	public EmployeeOperationController() {
		System.out.println("EmployeeOperationController.EmployeeOperationController()");
	}

	public List<Employee> getEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = empService.serachEmployeesByDesgs(desg1, desg2, desg3);
		return list;
	}
}
