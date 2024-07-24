package com.nt.ston;

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
