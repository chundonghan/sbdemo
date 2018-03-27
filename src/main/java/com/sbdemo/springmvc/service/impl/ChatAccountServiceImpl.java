package com.sbdemo.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbdemo.springmvc.dao.ChatAccountDao;
import com.sbdemo.springmvc.pojo.ChatAccount;
import com.sbdemo.springmvc.service.ChatAccountService;

@Service
public class ChatAccountServiceImpl implements ChatAccountService
{
    @Autowired
    private ChatAccountDao chatAccountDao;

    public List<String> getAllAccounts()
    {
        ChatAccount ac = new ChatAccount("es", "16d91faec77404be7c2e1d9c540356cd");
        ChatAccount signIn = chatAccountDao.signIn(ac);
        
        System.out.println(signIn.getNickname());
        
        return chatAccountDao.getAllAccounts();
    }

}
