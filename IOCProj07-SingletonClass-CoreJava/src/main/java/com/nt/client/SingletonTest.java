package com.nt.client;

import com.nt.ston.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode()+"........."+p2.hashCode());
		
		p1.PrintData("Hello");
		p2.PrintData("how are you");

	}

}
