package com.sbdemo.springmvc.pojo.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class City
{
    @Id
    private String id;

    private String name;

    @Field("gps")
    private Gps gps;

    /**
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the gps
     */
    public Gps getGps()
    {
        return gps;
    }

    /**
     * @param gps the gps to set
     */
    public void setGps(Gps gps)
    {
        this.gps = gps;
    }

}
