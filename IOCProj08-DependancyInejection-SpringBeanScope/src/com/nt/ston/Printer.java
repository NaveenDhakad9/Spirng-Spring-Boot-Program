package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prn")
@Scope("prototype")
public class Printer 
{

	private static Printer INSTANCE;
	private Printer() {
		System.out.println("Printer. 0 param-Constructor ");
	}
	
	public static Printer getInstance() {
		if(INSTANCE == null)
		 INSTANCE = new Printer();
		 return INSTANCE;
	}
	
	public void PrintData(String msg)
	{
		System.out.println(msg);
	}
}
