package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public final class ElectricEngine implements Engine {

	public ElectricEngine() {
		System.out.println("Electric Engine - contructor()"); 
	}
	
	@Override
	public String typeEngine(String name) {
		return "you choose "+ name +"Engine car"; 
	}
}
