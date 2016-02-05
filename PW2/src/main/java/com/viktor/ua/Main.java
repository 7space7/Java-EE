package com.viktor.ua;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Figure figure = (Figure) context.getBean("rectangle");
        figure.figereInfo();
        figure.drawFigure();
    }
}
