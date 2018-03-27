package com.spring.ch2.event.example_booking.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.spring.ch2.event.example_booking.BookingEvent;
import com.spring.ch2.event.example_booking.service.BookingService;

@Service("bookingService")
public class BookingServiceImpl implements BookingService
{
    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void booking(Map<String, Object> paramMap)
    {
        System.out.println("下单");
        // 加入队列
        applicationContext.publishEvent(new BookingEvent(this, "{\"id\":\"1\"}"));
    }

}
