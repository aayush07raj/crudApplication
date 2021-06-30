package com.example.employee.employees.service.impl;

import com.example.employee.employees.entity.Employee;
import com.example.employee.employees.repository.EmployeeRepository;
import com.example.employee.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Integer empId) {
        return employeeRepository.findById(empId);
    }

    @Override
    public Employee createNew(Employee employee) {
        return employeeRepository.save(employee);
    }

}
