package com.nt.test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfgs.AppConfig;
import com.nt.sbeans.Vechile;

public class StrategyPatternTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        Vechile v = ctx.getBean("vechile", Vechile.class);
        v.engine1();

        ctx.close();
    }
}

