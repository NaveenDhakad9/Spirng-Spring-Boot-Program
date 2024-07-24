package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
@ComponentScan(basePackages = "com.nt.beans,com.nt.ston")
public class Appconfig 
{ 
	  //@Bean("ldt")
	  @Bean
	  @Scope("singleton")
      public LocalDateTime createLDT()
      {
    	  return LocalDateTime.now();
      }
	  
	  
	  @Bean(name="prn")
	  @Scope("prototype")
	  public Printer createPrinter1()
	  {
		  return Printer.getInstance();
	  }
	  
	  
}
