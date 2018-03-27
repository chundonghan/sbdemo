package com.spring.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher
{
    @Autowired
    private ApplicationContext applicationContext;

    public void publish(String msg)
    {
        ApplicationEvent arg0 = new DemoEvent(this, msg);
        applicationContext.publishEvent(arg0);
    }
}
