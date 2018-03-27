package com.spring.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SpringConfig;


public class Main
{
    public static void main(String[] args) throws Exception
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        ElBean el = context.getBean(ElBean.class);
        el.outputResource();
        context.close();
    }
}
