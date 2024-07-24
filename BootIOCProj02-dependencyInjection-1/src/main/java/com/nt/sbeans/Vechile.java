package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public final class Vechile {
    
	@Autowired
	@Qualifier("motor")
	private Engine engine;
	
	public Vechile() {
		System.out.println("Vechile.constructor()");
	}
	
	public String engine(String engineType) {
        String msg = engine.typeEngine(engineType);
        return msg;
    }
}
