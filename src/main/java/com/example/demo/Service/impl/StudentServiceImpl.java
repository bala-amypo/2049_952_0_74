package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.sprin

import org.springframe.stereotype.Service;

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

