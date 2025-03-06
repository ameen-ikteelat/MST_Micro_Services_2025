package com.mst;

import com.mst.bean.Employee;
import com.mst.config.SpringConfig;
import com.mst.repo.EmployeeDao;
import com.mst.repo.EmployeeDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SpringConfig.class);

        EmployeeDao dao = (EmployeeDao) ctx.getBean(EmployeeDaoImpl.class);

        Employee e =  ctx.getBean(Employee.class);
        e.setAge(21);
        e.setSalary(5000);
        e.setName("David");
        System.out.println("Insert new Employee to DB MySql:"+dao.saveEmployee(e));
       // System.out.println("Employee count from MySQL: "+dao.count());
        System.out.println("get Employee name by id from MySQL: "+dao.getEmployeeNameById(8));
        System.out.println("get all employees from MySQL: "+dao.getAllEmployees());

    }
}