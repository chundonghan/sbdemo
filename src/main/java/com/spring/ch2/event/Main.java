package com.spring.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SpringConfig;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DemoPublisher bean = context.getBean(DemoPublisher.class);
        bean.publish("I have send a message");
        context.close();

    }
}
