package com.mst.repo;

import com.mst.bean.Employee;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class EmplyeeRowMapper  implements RowMapper<Employee> {
    public Employee mapRow(ResultSet rs, int index) throws SQLException {
        Employee employee   = new Employee();
        employee .setId( rs.getInt   ("id")  );
        employee .setName( rs.getString("name"));
        employee.setAge( rs.getInt   ("age") );
        employee.setSalary(rs.getDouble("salary"));
        return employee;
    }

}
