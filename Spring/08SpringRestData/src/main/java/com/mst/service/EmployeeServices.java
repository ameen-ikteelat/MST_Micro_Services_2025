package com.mst.service;

import java.util.List;
import java.util.Optional;

import com.mst.beans.Employee;

public interface EmployeeServices {

	public Employee saveEmployee (Employee employee);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getEmployeesByName(String name);
	
	public Employee getFirstEmployeeByage(int age) ;
	
	public void deletEmployee(Employee employee);
	
	public Optional<Employee> getEmployeeById( int id);
}
