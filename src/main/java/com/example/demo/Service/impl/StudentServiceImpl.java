package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.sterotype.Services;


import com.example.demo.enity.Student;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@service
public class StudentServiceImpl implements StudentService{
    @autowired
    studentRepository stdrepo;
    @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);

    }
}

