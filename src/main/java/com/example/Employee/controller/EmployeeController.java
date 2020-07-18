package com.example.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.domain.Employee;
import com.example.Employee.Service.EmployeeService;

@RestController
@RequestMapping(value = "/student")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Employee save(@RequestBody Employee student) {
        Employee employeeResponse = (Employee) employeeService.saveEmployee(student);
        return employeeResponse;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Employee getEmployee(@PathVariable Long id) {
        Employee employeeResponse = (Employee) employeeService.getEmployee(id);
        return employeeResponse;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStudent(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "employee has been deleted successfully";
    }

}