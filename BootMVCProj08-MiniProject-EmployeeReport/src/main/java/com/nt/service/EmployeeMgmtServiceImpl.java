package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository emprepo;
	
	@Override
	public Iterable<Employee> getAllEmployees() {
		
		return emprepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		
		return "Employee is saved with id value :"+emprepo.save(emp).getEmpno();
	}

	@Override
	public Employee getEmployeeByNo(int no) {
		Employee emp=emprepo.findById(no).orElseThrow(()-> new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is Updated with having id value :"+emprepo.save(emp).getEmpno();
	}

	@Override
	public String deleteEmployeeById(int no) {
	     emprepo.deleteById(no);
		return no+ " Employee id Employee is Deleted";
	}

}
