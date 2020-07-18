package com.example.Employee.Service;

import org.springframework.stereotype.Component;

import com.example.Employee.domain.Employee;

@Component
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(Long id);

    public void deleteEmployee(Long id);

}