package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements IVechile {
    @Override
    public String engine(String name) {
        return name + ", you choose car is ElectricEngine Car";
    }
}
