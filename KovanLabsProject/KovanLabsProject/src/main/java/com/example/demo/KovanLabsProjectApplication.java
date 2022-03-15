package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.controller.EmployeeController;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class KovanLabsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(KovanLabsProjectApplication.class, args);
		
	}
}
