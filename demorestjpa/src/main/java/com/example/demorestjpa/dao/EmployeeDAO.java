package com.example.demorestjpa.dao;

import com.example.demorestjpa.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
