package com.sbdemo.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdviceController
{
    @RequestMapping("/advice")
    public String toErrorPage(@ModelAttribute("msg") String msg) throws Exception
    {
        throw new Exception("error:" + msg);
    }
}
