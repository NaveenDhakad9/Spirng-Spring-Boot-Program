package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("disel")
public class DiseslEngine implements IVechile {
	public void engine() {
		System.out.println("You choose car is DiselEngine Car");
	}
}
