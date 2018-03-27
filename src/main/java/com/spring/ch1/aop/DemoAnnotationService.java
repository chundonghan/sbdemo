package com.spring.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService
{
    @Action(name = "注解拦截add方法")
    public void add()
    {
        System.out.println("asd");
    }
}
