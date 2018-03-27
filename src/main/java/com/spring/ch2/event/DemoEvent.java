package com.spring.ch2.event;

import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent
{

    private String msg;

    /**
     * @param source
     */
    public DemoEvent(Object source, String msg)
    {
        super(source);
        this.msg = msg;
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the msg
     */
    public String getMsg()
    {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg)
    {
        this.msg = msg;
    }

}
