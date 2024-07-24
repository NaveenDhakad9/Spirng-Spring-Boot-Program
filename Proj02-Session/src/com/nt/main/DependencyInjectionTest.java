package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.SeasonFinder;
import com.nt.config.AppConfig;

public class DependencyInjectionTest
{
	public static void main(String args[])
	{
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonFinder sf =ctx.getBean("sf",SeasonFinder.class);
		
		String result = sf.showseason();
		System.out.println(result);
		ctx.close();
	}

}
