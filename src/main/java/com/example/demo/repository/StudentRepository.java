package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.sterotype.Repepository;

import com.example
import com.example.demo.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
