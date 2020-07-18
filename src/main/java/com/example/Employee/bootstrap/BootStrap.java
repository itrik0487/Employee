package com.example.Employee.bootstrap;

import com.example.Employee.domain.Employee;
import com.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {
    @Autowired
    private final EmployeeRepository employeeRepository;


    public BootStrap(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("name",32);
        employeeRepository.save(employee);

        System.out.println("Started BootStrap");
        System.out.println("Employee BootStrap : "+employeeRepository.findById(employee.getId()));
    }
}
