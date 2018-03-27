package com.spring.ch2.el;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ElBean
{
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Value("normal value")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osName;// 获取系统信息

    @Value("#{T(java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoBean.anotherName}")
    private String fromAnotherName; // 获取bean属性

    @Value("${book.name}")
    private String bookName; // 获取Properties 文件内容

    @Value("http://www.baidu.com")
    private Resource textUrl;

    @Autowired
    private Environment env;

    /* @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }*/

    public void outputResource() throws Exception
    {
        logger.debug("普通值：{}", normal);
        logger.debug("系统参数(系统名称)：{}", osName);
        logger.debug("表达式：{}", randomNumber);
        logger.debug("其他bean属性：{}", fromAnotherName);
        logger.debug("配置文件属性：{}", bookName);
        logger.debug("配置文件属性：{}", env.getProperty("book.author"));
        System.out.println(IOUtils.toString(textUrl.getInputStream()));
    }
}
