package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;
import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class BootIocProj08DataInjectionYMLFile {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj08DataInjectionYMLFile.class,
				args);

		PatientInfo pinfo = ctx.getBean("pInfo", PatientInfo.class);
		System.out.println(pinfo);
		System.out.println(" ============= ");
		Customer cust = ctx.getBean("cust",Customer.class);
		System.out.println(cust);
		((ConfigurableApplicationContext) ctx).close();
	}

}
