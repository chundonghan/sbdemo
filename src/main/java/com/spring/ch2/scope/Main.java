package com.spring.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SpringConfig;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DemoSingletonBean s1 = context.getBean(DemoSingletonBean.class);
        DemoSingletonBean s2 = context.getBean(DemoSingletonBean.class);

        DemoPrototypeBean p1 = context.getBean(DemoPrototypeBean.class);
        DemoPrototypeBean p2 = context.getBean(DemoPrototypeBean.class);

        System.out.println(s1.equals(s2));
        System.out.println(p1.equals(p2));
        context.close();
    }
}
