package com.example.Employee.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
@EntityScan("com.example.Employee.domain")
public class SpringMain {
    public static void main(String[] args) {

        SpringApplication.run(SpringMain.class, args);
    }

}
