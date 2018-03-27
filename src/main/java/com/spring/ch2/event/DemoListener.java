package com.spring.ch2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListener implements ApplicationListener<DemoEvent>
{

    /**
     * @Title: onApplicationEvent
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param arg0 
     * @author: handongchun
     * @time:2017年11月20日 下午2:37:51
     * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
     * history:
     * 1、2017年11月20日 handongchun 创建方法
    */
    @Override
    public void onApplicationEvent(DemoEvent arg0)
    {
        String msg = arg0.getMsg();
        System.out.println(msg);

    }

}
