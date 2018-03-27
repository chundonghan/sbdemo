package com.spring.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        DemoAnnotationService as = context.getBean(DemoAnnotationService.class);
        as.add();
        context.close();
    }
}
