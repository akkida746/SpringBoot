package com.akash.SpringBootAop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
public class MyAspect {

    /*@Before("execution(public * *(..))")
    public void beforeName(){
        System.out.println("Called before advice");
    }*/

    @Before("execution(* com.akash.SpringBootAop.Customer.*.*(..))")
    public void beforeName(){
        System.out.println("Called before advice");
    }
}
