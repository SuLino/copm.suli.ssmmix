package com.suli.dao;

import com.suli.domain.Student;

import java.util.List;

/**
 * @author admin
 * @version 1.0 <br/>
 * <p style="font-family:SimSun;font-weight:bold">时间:<br/>2021/10/23 21:01</p>
 * @description
 */
public interface StudentDao {
    int insertStu(Student student);
    List<Student> selectStu();
}
