package com.example.jpademo.dao;

import com.example.jpademo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void  save(Student theStudent);
    Student  findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student theStudent);
    void delete(int StudentId);
    int deleteAll();
}
