package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootIocProj07 {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj07.class, args);
        Employee ad = ctx.getBean("emp",Employee.class);
        System.out.println(ad);
        ((ConfigurableApplicationContext) ctx).close();
	}

}
