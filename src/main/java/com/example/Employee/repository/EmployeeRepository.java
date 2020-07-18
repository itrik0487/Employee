package com.example.Employee.repository;

import com.example.Employee.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.Serializable;
import java.lang.invoke.SerializedLambda;

public interface EmployeeRepository extends CrudRepository<Employee, Serializable>{
}
