package com.nekta.springboot.cruddemo.dao;

import com.nekta.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
