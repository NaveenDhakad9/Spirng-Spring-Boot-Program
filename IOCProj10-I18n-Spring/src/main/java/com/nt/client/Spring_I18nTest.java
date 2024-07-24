package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Spring_I18nTest {
	
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Language code : ");
		String lang = sc.next();
		System.out.println("Enter country code : ");
		String country = sc.next();
		
		Locale locale = new Locale(lang,country);
		
		String msg1 = ctx.getMessage("welcom.msg",new Object[] {}, locale);
		String msg2 = ctx.getMessage("goodbye.msg",new Object[] {}, locale);
		String msg3 = ctx.getMessage("wish.msg",new Object[] {}, locale);
		
		System.out.println(msg1+"...."+msg2+"....."+msg3);
		
		sc.close();
		ctx.close();
	}

}
