package com.sbdemo.springmvc.dao.redis;

import java.io.Serializable;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisDao
{
    @SuppressWarnings("rawtypes")
    @Resource
    private RedisTemplate redisTemplate;

    /** 批量删除缓存 */
    public void remove(final String... keys)
    {
        for (String key : keys)
        {
            remove(key);
        }
    }

    /** 批量删除缓存(通配符) */
    public void removePattern(final String pattern)
    {
        Set<Serializable> keys = redisTemplate.keys(pattern);
        if (keys.size() > 0)
            redisTemplate.delete(keys);
    }

    /** 删除缓存  */
    public void remove(final String key)
    {
        if (exists(key))
        {
            redisTemplate.delete(key);
        }
    }

    /** 判断缓存中是否有对应的value */
    public boolean exists(final String key)
    {
        return redisTemplate.hasKey(key);
    }

    /** 读取缓存  */
    public Object get(final String key)
    {
        return redisTemplate.opsForValue().get(key);
    }

    /** 写入缓存  */
    public boolean set(final String key, Object value)
    {
        boolean result = false;
        try
        {
            redisTemplate.opsForValue().set(key, value);
            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }

    /** 写入缓存(可以配置过期时间) */
    public boolean set(final String key, Object value, Long expireTime)
    {
        boolean result = false;
        try
        {
            redisTemplate.opsForValue().set(key, value);
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
            result = true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return result;
    }
}
