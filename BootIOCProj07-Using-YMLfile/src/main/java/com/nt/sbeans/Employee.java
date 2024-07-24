package com.nt.sbeans;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix="org.nt")
public class Employee {
	private Integer eno;
	private String ename;
	private Long phone;
	private String location;
    
	private String[] favColor;
	
	private List<String> nickName;
	private Set<Long> phoneNumber;
	
	private Map<String,Object> idDetails;
	private Address addrs;
	

}
