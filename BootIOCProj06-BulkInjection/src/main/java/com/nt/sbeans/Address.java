package com.nt.sbeans;

//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;

import lombok.Data;

//@Component("addrs")
@Data
//@ConfigurationProperties(prefix="addrs.nt")
public class Address {
    private String name;
    private String address;
    private Long pinCode;
    private Long phoneNumber;
	
   
}
