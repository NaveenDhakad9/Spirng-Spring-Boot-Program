package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.beans")
public class Appconfig 
{ 
	  @Bean("ldt")
      public LocalDateTime createLDT()
      {
    	  return LocalDateTime.now();
      }
}
