package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.@Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import


import com.example.demo.entity.Student;

@RestController
public class StudentController {
    @Autowired
    StudentService stdser;
    PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stder.poststudent(st);
        
    }

}
