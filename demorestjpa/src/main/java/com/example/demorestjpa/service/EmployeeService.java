package com.example.demorestjpa.service;

import com.example.demorestjpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
