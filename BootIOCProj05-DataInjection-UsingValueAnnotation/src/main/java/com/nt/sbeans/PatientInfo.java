package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {
     @Value("101")
	 private Integer pid;
     @Value("${pi.name}")
     private String pname;
     @Value("${pi.mobileNo}")
     private Long mobileNo;
     @Value("${pi.addrs}")
     private String addrs;
     
     @Value("#{dcc.xrayPrice+dcc.ctscanPrice+dcc.ecgPrice}")
     private Double billamount;
     
     @Value("#{dcc.ecgPrice<=0}")
     private Boolean ecgFree;
     
     @Value("${os.name}")
     private String osName;
     
     @Value("${path}")
     private String pathData;

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", addrs=" + addrs
				+ ", billamount=" + billamount + ", ecgFree=" + ecgFree + ", osName=" + osName + ", pathData="
				+ pathData + "]";
	}
     
     
     
}
