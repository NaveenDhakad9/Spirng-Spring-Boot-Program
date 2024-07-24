package com.nt.comp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechile")
public final class Vechile {
    @Autowired
    @Qualifier("disel")
    private IVechile vechile;

    public String engine1(String engineType) {
        String msg = vechile.engine(engineType);
        return msg;
    }
}
