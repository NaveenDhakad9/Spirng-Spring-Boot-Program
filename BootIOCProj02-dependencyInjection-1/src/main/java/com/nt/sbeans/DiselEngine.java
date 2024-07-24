package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("disel")
public final class DiselEngine implements Engine {

	public DiselEngine() {
		System.out.println("DiselEngine - contructor()"); 
	}
	
	@Override
	public String typeEngine(String name) {
		return "you choose "+ name +"Engine car"; 
	}
}
