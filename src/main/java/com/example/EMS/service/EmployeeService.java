package com.example.EMS.service;

import com.example.EMS.entity.Employee;

import java.util.List;
import java.util.UUID;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(UUID id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(UUID id, Employee employee);
    void deleteEmployee(UUID id);
}

