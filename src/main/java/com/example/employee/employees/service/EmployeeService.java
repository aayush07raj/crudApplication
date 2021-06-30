package com.example.employee.employees.service;

import com.example.employee.employees.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAll();

    Employee getEmployee(Integer empId);

    Employee createNew(Employee employee);

}
