package com.sbdemo.springmvc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.sbdemo.springmvc.pojo.ChatAccount;

@Mapper
@Repository
public interface ChatAccountDao
{

    @Select("SELECT account FROM chat_account WHERE enable_flag = '1'")
	List<String> getAllAccounts();
	
    @Select("SELECT nickname,avatar FROM chat_account WHERE account = #{account}  AND password = #{password} AND enable_flag = '1'")
    ChatAccount signIn(ChatAccount chatAccount);
}
