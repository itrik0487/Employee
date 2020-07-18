package com.example.Employee.Impl;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.Employee.domain.Employee;
import com.example.Employee.repository.EmployeeRepository;
import com.example.Employee.Service.EmployeeService;

@Service("studentServiceImpl")
public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee saveEmployee(Employee employee) {
        Employee response =  employeeRepository.save(employee);
        return response;
    }

    @Transactional(readOnly = true)
    public Employee getEmployee(Long id ) {
        Optional<Employee> employeeResponse =  employeeRepository.findById(id);
        Employee employee = null;
        if(employeeResponse.isPresent()) {
            employee = employeeResponse.get();
        }else {
            throw new RuntimeException("No record found for given id: "+id);
        }

        return employee;
    }


    public void deleteEmployee(Long id ) {
        employeeRepository.deleteById(id);
    }

}
