package com.sbdemo.springmvc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdemo.springmvc.dao.mongodb.CityRepository;
import com.sbdemo.springmvc.pojo.mongodb.City;
import com.sbdemo.springmvc.service.RedisService;

@RestController
@RequestMapping("/mongodb")
public class MongodbController
{
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/findAllCity")
    public List<City> findAllCity()
    {

        System.out.println(redisService.get("key"));
        return cityRepository.findAll();
    }


}
