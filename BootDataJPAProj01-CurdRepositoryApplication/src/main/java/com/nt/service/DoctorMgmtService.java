package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtService implements IDoctorService {
    @Autowired
	private IDoctorRepo doctorRepo;
	@Override
	public String registerDoctor(Doctor doctor) {
		Doctor doc=doctorRepo.save(doctor);
		return "Doctor obj is saved with  id value: "+doc.getDocID();
	}

}
