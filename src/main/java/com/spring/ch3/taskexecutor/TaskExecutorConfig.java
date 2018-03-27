package com.spring.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.spring.SpringConfig;

@EnableAsync
public class TaskExecutorConfig extends SpringConfig implements AsyncConfigurer
{

    @Override
    public Executor getAsyncExecutor()
    {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5); // 线程核心池连接数量
        taskExecutor.setMaxPoolSize(10); // 线程池最大连接数
        taskExecutor.setQueueCapacity(25); // 队列长度
        taskExecutor.initialize(); // 初始化
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler()
    {
        // TODO Auto-generated method stub
        return null;
    }

}
