package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.Appconfig;

public class DependancyInjectionTest {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Appconfig.class);
		
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		String Result = generator.showWishMessage("Naveen");
		System.out.println(Result);
		
		ctx.close();
		

	}

}
