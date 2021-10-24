package com.suli.service.impl;

import com.suli.dao.StudentDao;
import com.suli.domain.Student;
import com.suli.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author admin
 * @version 1.0 <br/>
 * <p style="font-family:SimSun;font-weight:bold">时间:<br/>2021/10/23 21:10</p>
 * @description
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public int addStu(Student student) {
        return studentDao.insertStu(student);
    }

    @Override
    public List<Student> queryStu() {

        return studentDao.selectStu();
    }
}
