package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class BootIocProj05DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj05DataInjectionUsingValueAnnotationApplication.class,
				args);

		PatientInfo pinfo = ctx.getBean("pInfo", PatientInfo.class);
		System.out.println(pinfo);
		((ConfigurableApplicationContext) ctx).close();
	}

}
