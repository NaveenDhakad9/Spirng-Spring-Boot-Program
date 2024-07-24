package com.nt.comp;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IVechile {
    @Override
    public String engine(String name) {
        return name + ", you choose car is PetrolEngine Car";
    }
}
