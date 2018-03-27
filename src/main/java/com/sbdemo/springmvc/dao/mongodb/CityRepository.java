package com.sbdemo.springmvc.dao.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbdemo.springmvc.pojo.mongodb.City;

public interface CityRepository extends MongoRepository<City, String>
{

}
