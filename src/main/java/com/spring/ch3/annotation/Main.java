package com.spring.ch3.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{

    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        context.getBean(DemoService.class).outputResult();
        System.out.println(context.getParent());
    }

}
