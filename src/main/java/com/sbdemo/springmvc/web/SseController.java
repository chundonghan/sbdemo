package com.sbdemo.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SERVER　SEND EVENT
 */
@Controller
public class SseController
{
    private static String msg = "";

    private static boolean change_flag = false;
    @RequestMapping(value = "/push", produces = "text/event-stream;charset=utf-8")
    @ResponseBody
    public String push() throws Exception
    {
        if (change_flag)
        {
            change_flag = false;
            return "data:" + msg + "\n\n";
        }
        else
        {
            return "data:" + "" + "\n";

        }
    }

    @RequestMapping(value = "/sendMsg.do")
    @ResponseBody
    public String sendMsg(@RequestParam(value = "inputText", defaultValue = "") String inputText) throws Exception
    {
        msg = inputText;
        change_flag = true;
        return "succ";
    }

}
