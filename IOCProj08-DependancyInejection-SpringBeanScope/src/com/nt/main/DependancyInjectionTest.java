package com.nt.main;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.Appconfig;

public class DependancyInjectionTest {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(Appconfig.class);
		/*
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		String Result = generator.showWishMessage("Naveen");
		System.out.println(Result);
		
		System.out.println("...........");
		WishMessageGenerator generator1 = ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.hashCode()+"....."+generator1.hashCode());
		*/
		
		/*  
		LocalDateTime ldt=ctx.getBean("ldt",LocalDateTime.class);
		LocalDateTime ldt1=ctx.getBean("ldt",LocalDateTime.class);
		System.out.println(ldt.hashCode()+"....."+ldt1.hashCode());
		System.out.println(".........");
		
		Printer p1 = ctx.getBean("prn1",Printer.class);
		Printer p2 = ctx.getBean("prn1",Printer.class);
		System.out.println(p1.hashCode()+"...."+p2.hashCode());
		*/
		
		/*
		Printer p3 = ctx.getBean("prn",Printer.class);
		Printer p4 = ctx.getBean("prn",Printer.class);
		System.out.println(p3.hashCode()+"...."+p4.hashCode());
		*/
		
		WishMessageGenerator wmg = ctx.getBean("wishMessageGenerator",WishMessageGenerator.class);
		System.out.println(wmg.showWishMessage("raja"));
		
		LocalDateTime dt = ctx.getBean("createLDT",LocalDateTime.class);
		System.out.println(dt);
		
		System.out.println("Spring bean Definitation count ::"+ ctx.getBeanDefinitionCount());
		System.out.println("Spring bean ids "+Arrays.toString(ctx.getBeanDefinitionNames()));
		ctx.close();
		
		
		

	}

}
