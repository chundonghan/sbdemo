package com.sbdemo.springmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbdemo.springmvc.service.ChatAccountService;

@Controller
public class IndexController
{
    @Autowired
    private ChatAccountService chatAccountService;

    @RequestMapping("/index")
    public String index()
    {
        System.out.println(chatAccountService.getAllAccounts());
        return "index";
    }
}
