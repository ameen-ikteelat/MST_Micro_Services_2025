package com.mst;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mst.doa.DepartmentRepository;
import com.mst.doa.EmployeeRepository;
import com.mst.doa.beans.Department;
import com.mst.doa.beans.Employee;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		EmployeeRepository emplRepo = (EmployeeRepository) ctx.getBean(EmployeeRepository.class);
		
		DepartmentRepository deptRepo = ctx.getBean(DepartmentRepository.class);
		
		Department depart = ctx.getBean(Department.class);
		depart.setName("R&D");
		
		//deptRepo.save(depart);
		
		Employee epl1 = ctx.getBean(Employee.class);
		epl1.setDepartment(depart);
		epl1.setName("Alex");
		
		emplRepo.save(epl1);
		
		
		
	}

}
