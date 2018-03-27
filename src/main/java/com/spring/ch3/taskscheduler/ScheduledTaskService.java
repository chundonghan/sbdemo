package com.spring.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService
{
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Logger log = LoggerFactory.getLogger(getClass());

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime()
    {
        log.debug("每隔5秒执行一次，当前时间为：{}", dateFormat.format(new Date()));
    }

    /*@Scheduled(cron = "0 27 15 ? * *")
    public void fixTimeExecution()
    {
        log.debug("在指定时间：{}", dateFormat.format(new Date()));
    }*/

}

