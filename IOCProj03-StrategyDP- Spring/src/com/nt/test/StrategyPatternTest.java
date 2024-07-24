package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.appcon.AppConfig;
import com.nt.comp.Vechile;

public class StrategyPatternTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Vechile v = ctx.getBean("vechile", Vechile.class);
        String result = v.engine1("disel");
        System.out.println(result);

        ctx.close();
    }
}
