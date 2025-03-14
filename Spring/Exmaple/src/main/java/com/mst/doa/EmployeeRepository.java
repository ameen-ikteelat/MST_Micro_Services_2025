package com.mst.doa;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mst.doa.beans.Address;
import com.mst.doa.beans.Employee;
import com.mst.doa.beans.Gender;


@Repository   // optional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
 
	List<Employee> findEmployeesByName (String name);
	List<Employee> findEmployeesByGenderNot(Gender gender);
	Optional<Employee> findFirstEmployeesByAddress(Address address);
}
