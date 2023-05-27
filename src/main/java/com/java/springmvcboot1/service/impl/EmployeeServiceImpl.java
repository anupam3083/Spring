package com.java.springmvcboot1.service.impl;

import org.springframework.stereotype.Service;

import com.java.springmvcboot1.model.Employee;
import com.java.springmvcboot1.repository.EmployeeRepository;
import com.java.springmvcboot1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

}
