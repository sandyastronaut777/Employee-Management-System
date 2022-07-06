package com.ldt.EmployeeManagementSystem.service;

import com.ldt.EmployeeManagementSystem.entity.Employee;

import java.util.List;



public interface EmployeeService {

    List<Employee> findAllEmployees();

    Employee findEmployeeById(long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    boolean deleteEmployee(long id);
}