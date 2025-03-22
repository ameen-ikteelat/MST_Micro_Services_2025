package com.mst.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.beans.Employee;
import com.mst.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getEmployeesByName(String name) {
		return employeeRepository.findEmployeesByName(name);
	}

	@Override
	public Employee getFirstEmployeeByage(int age)  {
		
		return employeeRepository.findFirstEmployeeByage(age);
	}

	@Override
	public void deletEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
	
	@Override
	public Optional<Employee> getEmployeeById( int id)
	{
		return employeeRepository.findById(id);
		
	}

}
