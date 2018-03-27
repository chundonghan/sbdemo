package com.spring.ch2.event.example_booking;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BookingListener implements ApplicationListener<BookingEvent>
{

    @Override
    public void onApplicationEvent(BookingEvent event)
    {
        String json_str = event.getJson_str();

        System.out.println("加入队列：" + json_str);
    }

}
