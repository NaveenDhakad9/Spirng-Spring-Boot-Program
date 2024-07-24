package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public final class Vechile {
    @Autowired
    @Qualifier("petrol")
    private IVechile vechile;

    public void engine1() {
        vechile.engine();
    }
}
