package com.sbdemo.springmvc.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbdemo.springmvc.pojo.DemoObj;

@RestController
@RequestMapping("/rest")
public class DemoRestController
{
    @RequestMapping(value = "/{data}")
    public String showData(@PathVariable("data") String data)
    {
        return data;
    }

    @RequestMapping(value = "/{id}/{name}", produces = { "application/json;charset=UTF-8" })
    public DemoObj showObj(@PathVariable("id") Integer id, @PathVariable("name") String name)
    {
        return new DemoObj(id, name);
    }

    @RequestMapping("/getNames.do")
    public List<Map<String, String>> getNames()
    {
        List<Map<String, String>> names = new ArrayList<>();

        Map<String, String> name = new HashMap<>();
        name.put("name", "Andy");
        name.put("country", "America");
        names.add(name);
        name = new HashMap<>();
        name.put("name", "Emily");
        name.put("country", "Canada");
        names.add(name);
        name = new HashMap<>();
        name.put("name", "Lee");
        name.put("country", "China");
        names.add(name);
        return names;
    }
}
