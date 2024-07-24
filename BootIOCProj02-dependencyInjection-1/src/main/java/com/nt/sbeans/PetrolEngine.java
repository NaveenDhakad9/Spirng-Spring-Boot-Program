package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public final class PetrolEngine implements Engine {

	public PetrolEngine() {
		System.out.println("PetrolEngine - contructor()"); 
	}
	
	@Override
	public String typeEngine(String name) {
		return "you choose "+ name +"Engine car"; 
	}
}
