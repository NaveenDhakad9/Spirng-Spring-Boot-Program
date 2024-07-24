package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootIocProj06BulkInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj06BulkInjectionApplication.class, args);
        Employee ad = ctx.getBean("emp",Employee.class);
        System.out.println(ad);
        ((ConfigurableApplicationContext) ctx).close();
	}

}
