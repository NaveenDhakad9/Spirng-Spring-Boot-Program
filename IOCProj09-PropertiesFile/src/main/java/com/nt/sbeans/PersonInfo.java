package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("pInfo")
public class PersonInfo {

	//Collect from properties file
	@Value("${per.id}")
	private int pid;
	@Value("${per.name}")
	private String pname;
	@Value("${per.addrs}")
	private String addrs;
	
	//hard code value
	@Value("naveendhakad918")
	private String email;
	
	//collect from System properties
    @Value("${os.name}")
	private String osName;
    @Value("${os.version}")
    private String osVer;
    
    //collect from env.. variable
    @Value("${Path}")
    private String pathData;

  //toString() {alt+shift+s,s}
	@Override
	public String toString() {
		return "PersonInfo [pid=" + pid + ", pname=" + pname + ", addrs=" + addrs + ", email=" + email + ", osName="
				+ osName + ", osVer=" + osVer + ", pathData=" + pathData + "]";
	}
    
    
    
    
    
	

}
