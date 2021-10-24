package com.suli.service;

import com.suli.domain.Student;

import java.util.List;

/**
 * @author admin
 * @version 1.0 <br/>
 * <p style="font-family:SimSun;font-weight:bold">时间:<br/>2021/10/23 21:08</p>
 * @description
 */
public interface StudentService {
    int addStu(Student student);
    List<Student> queryStu();
}
