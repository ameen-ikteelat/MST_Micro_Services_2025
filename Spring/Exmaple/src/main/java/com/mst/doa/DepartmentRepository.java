package com.mst.doa;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mst.doa.beans.Department;


@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

	public Department findDepartmentByName( String name);
	
}
