package com.suli.handler;

import com.suli.exception.AgeException;
import com.suli.exception.NameException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author admin
 * @version 1.0 <br/>
 * <p style="font-family:SimSun;font-weight:bold">时间:<br/>2021/10/24 21:50</p>
 * @description
 */
//表示当前类是异常处理类
@ControllerAdvice
public class GlobalExceptionHandler {
    //处理NameException的异常
    @ExceptionHandler(value = NameException.class)
    public ModelAndView nameExceptionHandler(Exception e){
        ModelAndView mv =new ModelAndView();
        mv.addObject("warning", "姓名必须为zs");
        mv.setViewName("nameError");
        return mv;
    }
    //处理AgeException的异常
     @ExceptionHandler(value = AgeException.class)
    public ModelAndView ageExceptionHandler(Exception e){
        ModelAndView mv =new ModelAndView();
        mv.addObject("warning", "年龄不能大于80");
         mv.setViewName("ageError");
        return mv;
    }
    //处理其它异常
    @ExceptionHandler
    public ModelAndView defaultExceptionHandler(Exception e){
        ModelAndView mv =new ModelAndView();
        mv.addObject("warning", "请重试");
        mv.setViewName("defaultError");
        return mv;
    }

}
