package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.bean.WeekEndOrWork;
import com.nt.config.AppConfig;

public class DependencyInjection {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx =
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		WeekEndOrWork gerneator = ctx.getBean("weow",WeekEndOrWork.class);
		String result = gerneator.dayofWeek();
		System.out.println(result);
		
		ctx.close();

	}

}
