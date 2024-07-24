package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("disel")
public class DiseslEngine implements IVechile {
    @Override
    public String engine(String name) {
        return name + ", you choose car is DiselEngine Car";
    }
}
