package com.suli.controller;

import com.suli.domain.Student;
import com.suli.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import java.util.List;

/**
 * @author admin
 * @version 1.0 <br/>
 * <p style="font-family:SimSun;font-weight:bold">时间:<br/>2021/10/23 21:20</p>
 * @description
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //添加学生
    @RequestMapping("/addStudent.do")
    public ModelAndView addStu(Student student){
        ModelAndView mv=new ModelAndView();
        String msg="注册失败";
        //调用service,处理业务逻辑，结果返回给用户
        int i = studentService.addStu(student);
        if(i>0){
            //添加成功，返回数据和视图
            msg="注册成功";
        }
        mv.addObject("msg", student.getName()+"："+msg);
        mv.setViewName("result");
        return mv;
    }
    @RequestMapping("/queryStu.do")
    @ResponseBody
    public List<Student> queryStu(){
        return studentService.queryStu();
    }
}

