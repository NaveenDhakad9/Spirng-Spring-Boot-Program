package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class ValueAnnotationTest 
{
	public static void main(String[] args)
	{
		//Create IOC Container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
	    //get SpringBean class obj ref
		PersonInfo info = ctx.getBean("pInfo",PersonInfo.class);
		System.out.println(info);
		
		//close the IOC Container
		ctx.close();
	}

}
