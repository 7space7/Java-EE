package com.viktor.ua;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Warning {

    @Pointcut("execution(* com.viktor.ua.iFigure.drawFigure(..))")
    public void drawFigure(){}
    @Pointcut("execution(* com.viktor.ua.Orange.setColor(..))")
    public void setColor(){}


    @After("drawFigure()")
    public void warn(){
        System.out.println("Error");
    }

    @After("setColor()")
    public void warnAgain(){
        System.out.println("Error");
    }
}

