package com.nekta.springboot.cruddemo.service;

import com.nekta.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
