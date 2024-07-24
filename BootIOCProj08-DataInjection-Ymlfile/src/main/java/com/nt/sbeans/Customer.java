package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@Data
@ConfigurationProperties(prefix="org.nt")
public class Customer {

	private String name;
	private String addrs;
	private Long pinCode;
	private Long phone;
	private String email;
	private Long size;
	
}
