package com.spring.ch2.event.example_booking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.SpringConfig;
import com.spring.ch2.event.example_booking.service.BookingService;

public class BookingMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookingService bean = context.getBean(BookingService.class);
        bean.booking(null);
        context.close();
    }
}
