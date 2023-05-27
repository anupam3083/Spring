package com.java.springmvcboot1.service;

import org.springframework.stereotype.Service;

import com.java.springmvcboot1.model.Employee;

@Service
public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);

}
