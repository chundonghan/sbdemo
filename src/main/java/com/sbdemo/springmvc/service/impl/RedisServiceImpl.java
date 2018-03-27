package com.sbdemo.springmvc.service.impl;

import javax.annotation.Resource;

import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import com.sbdemo.springmvc.service.RedisService;

@Service
public class RedisServiceImpl implements RedisService
{
    @Resource
    private RedisTemplate<String, ?> redisTemplate;

    @Override
    public String get(String key)
    {
        String result = redisTemplate.execute(new RedisCallback<String>()
        {
            @Override
            public String doInRedis(RedisConnection connection) throws DataAccessException
            {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] value = connection.get(serializer.serialize(key));
                return serializer.deserialize(value);
            }
        });
        return result;
    }


}
