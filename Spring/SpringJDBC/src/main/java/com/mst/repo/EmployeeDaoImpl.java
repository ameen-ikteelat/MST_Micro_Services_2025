package com.mst.repo;

import com.mst.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Override
    public String getEmployeeNameById(int id) {
        String sql = "select name from employee where id = ?";
        String name = jdbcTemplate.queryForObject(sql, new Object[] { id }, String.class);
        //System.out.println("the name is"+name);
        return name;
    }

    @Override
    public List<Employee> getAllEmployees() {
        String sql = "select * from Employee";
        Object[] args = null; // { id } ;
        List<Employee> list = jdbcTemplate.query(sql, args, new EmplyeeRowMapper());
        return list;

    }

    @Override
    public List<Employee> getEmployeesByNameLike(String name) {
        return List.of();
    }

    @Override
    public int saveEmployee(Employee e) {
       String sql = "insert into employee (name, age, salary) values (?, ?, ?)";
       Object[] args = {e.getName(), e.getAge(), e.getSalary()};
        int[] types = { Types.VARCHAR, Types.DOUBLE,Types.INTEGER };
        int insertCount = jdbcTemplate.update(sql, args, types);
        return insertCount;
    }

    @Override
    public void deleteAll() {

    }
}
