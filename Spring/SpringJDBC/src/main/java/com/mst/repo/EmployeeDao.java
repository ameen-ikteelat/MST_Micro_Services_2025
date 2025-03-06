package com.mst.repo;

import com.mst.bean.Employee;

import java.util.List;

public interface EmployeeDao {
    public String getEmployeeNameById(int id);
    public List<Employee> getAllEmployees();
    public List<Employee> getEmployeesByNameLike(String name);
    public int saveEmployee(Employee e);
    public void deleteAll();
}
