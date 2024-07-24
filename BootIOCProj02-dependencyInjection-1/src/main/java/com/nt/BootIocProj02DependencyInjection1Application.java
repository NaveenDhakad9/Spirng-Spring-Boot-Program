package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vechile;

@SpringBootApplication
@ImportResource("com/nt/cfg/applicationContext.xml")
public class BootIocProj02DependencyInjection1Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootIocProj02DependencyInjection1Application.class, args);
		
		Vechile v =ctx.getBean("vechile",Vechile.class);
		String name = v.engine("Disel");
		System.out.println(name);
	}

}
