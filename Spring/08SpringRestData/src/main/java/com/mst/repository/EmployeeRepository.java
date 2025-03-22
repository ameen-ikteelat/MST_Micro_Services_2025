package com.mst.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mst.beans.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findEmployeesByName(String name);
	
	Employee findFirstEmployeeByage(int age);
	
	//@Query("Select e from com.mst.beans.Employee e where e.salary BETWEEN :from AND :to ")  //HQL 
	//List<Employee> findEmployeeBetweenSalary(@Param("from") double from  , @Param("to") double to);
}
