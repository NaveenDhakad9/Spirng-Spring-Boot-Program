package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
    @Value("1234")
	private Integer hostelId;
    @Value("${hotel.name}")
    private String hotelName;
    @Value("${hotel.addrs}")
    private String hotelAddrs;
    @Value("${hotel.contactno}")
    private String mobileNo;
    
    @Value("${customer.name}")
    private String customerName;
    
    @Value("#{menup.idlyPrice+menup.dosaPrice}")//SPEL for arithmetic operation
    private Float billAmount;
    
    
    @Value("${os.name}")
    private String osName;
    
    @Value("${user.name}")
    private String windowsUser;
    
    @Value("${path}")
    private String pathData;

	@Override
	public String toString() {
		return "Hotel [hostelId=" + hostelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", mobileNo="
				+ mobileNo + ", customerName=" + customerName + ", billAmount=" + billAmount + ", osName=" + osName
				+ ", windowsUser=" + windowsUser + ", pathData=" + pathData + "]";
	}
    
    
}
