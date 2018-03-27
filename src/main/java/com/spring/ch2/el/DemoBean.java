package com.spring.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoBean
{
    @Value("aka. I do not know")
    private String anotherName;

    public void setAnotherName(String anotherName)
    {
        this.anotherName = anotherName;
    }

    public String getAnotherName()
    {
        return anotherName;
    }
}
