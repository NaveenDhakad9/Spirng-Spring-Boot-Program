package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.IDoctorService;
@Component 
public class CurdRepoTest implements CommandLineRunner {

	@Autowired
	private IDoctorService service;
	
	@Override
	public void run(String... args) throws Exception {
	try {
		Doctor doctor = new Doctor();
		doctor.setDocName("Prabhat");
		doctor.setSpecialization("Endocrinologist");
		doctor.setIncome(70000.0);
		String resultMsg = service.registerDoctor(doctor);
		System.out.println(resultMsg);
	} catch (Exception e) {
		e.printStackTrace();
	}
	

	}

}
