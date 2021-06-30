package com.example.employee.employees.repository;

import com.example.employee.employees.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {

    Employee findById(Integer empId);
}
