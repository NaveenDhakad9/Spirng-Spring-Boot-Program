package com.nt.config;

import java.time.LocalDate;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.bean")
public class AppConfig 
{
	@Bean(name = "LDT")
	public LocalDate createLDT()
	{
		return LocalDate.now();
	}

}
