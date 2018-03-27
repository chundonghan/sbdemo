package com.sbdemo.springmvc.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * 控制器全局配置
 */
@ControllerAdvice
public class ExceptionHandlerAdvice
{
    @ExceptionHandler
    public ModelAndView exception(Exception ex, WebRequest request)
    {
        ModelAndView mv = new ModelAndView("error");
        mv.addObject("errorMessage", ex.getMessage());
        return mv;
    }

    // 全局参数
    @ModelAttribute
    public void addAttribute(Model model)
    {
        model.addAttribute("msg", "请求");
    }

    // 定制WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder)
    {

    }
}
