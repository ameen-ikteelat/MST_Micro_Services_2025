package com.mst.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mst.doa.DepartmentRepository;
import com.mst.doa.EmployeeRepository;
import com.mst.doa.beans.Department;
import com.mst.doa.beans.Employee;

@Service
public class EmployeeServices  {
	
	@Autowired
	EmployeeRepository emplRepo;
	@Autowired
	DepartmentRepository deptRepo;
	
	public Employee saveEmployee(Employee employee) throws Exception
	{
		if( employee == null )
		{
			throw new Exception("Employee object is null");
			
		}
		
		try {
			//Extract department details from the request
			Department department = employee.getDepartment();
			
			// Check if department exists in the system
			Department fetchedDepartment =  getDepartment(department);
			employee.setDepartment(fetchedDepartment);
			
			return emplRepo.save(employee);
		}catch ( Exception ex)
		{
			 throw new Exception(ex.getMessage());
		}
	}

	private Department getDepartment(Department department) {
		Department existingDepartment = deptRepo.findDepartmentByName(department.getName());
		return existingDepartment;
	}
	
}
