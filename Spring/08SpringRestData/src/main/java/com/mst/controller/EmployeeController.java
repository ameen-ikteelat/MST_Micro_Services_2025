package com.mst.controller;

import java.util.List;
import java.util.Optional;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mst.beans.Employee;
import com.mst.service.EmployeeServices;

// http://www.ynet.co.il(host +port)
//http://localhost:8080/employees/createemployee   web service  (web - http + url)

@RestController //@Controller @ResponseBody
@RequestMapping(value="/employees")
public class EmployeeController {
	@Autowired
	private EmployeeServices employeeServices;
	
	
	//@RequestMapping(value="/employees/createemployee" , method =MethodType.GET)
	@PostMapping(value="/createemployee")
	public Employee createNewEmployee(@RequestBody Employee employee)
	{
		Employee createdEmployee ;
		createdEmployee = employeeServices.saveEmployee(employee);
		return createdEmployee;
	}
	
	//http://localhost:8080/employees/getemployees
	@GetMapping(value="/getemployees")
	public List<Employee> getCompanyEmployees() {
		return employeeServices.getAllEmployees();
	}
	
	//http://localhost:8080/employees/getemplby/name/Dawod
	@GetMapping(value="/getemplbyname/{name}" , consumes = "application/json")
	public List<Employee> getEmployeesByName(@PathVariable String name){
		return employeeServices.getEmployeesByName(name);
	}
	
	//http://localhost:8080/employees/getemplbyage?21
	@GetMapping(value="/getemplbyage" , consumes = "application/json")
	public Employee getTopEmployeeByage(@RequestParam int age) {
		return employeeServices.getFirstEmployeeByage(age);
	}
	
	public void deletEmployee(Employee employee) {
		 employeeServices.deletEmployee(employee);
	}
	@GetMapping(value="getemplbyid/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id)
	{
		return employeeServices.getEmployeeById(id);
	}
}
