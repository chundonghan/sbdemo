package com.spring.ch2.event.example_booking;

import org.springframework.context.ApplicationEvent;

public class BookingEvent extends ApplicationEvent
{
    private static final long serialVersionUID = 1L;
    private String json_str;

    public BookingEvent(Object source, String json_str)
    {
        super(source);
        this.json_str = json_str;
    }

    public String getJson_str()
    {
        return json_str;
    }

    public void setJson_str(String json_str)
    {
        this.json_str = json_str;
    }

}
