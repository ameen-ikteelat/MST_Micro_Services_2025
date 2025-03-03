package ioc.clas;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ioc.clas.Employee;


public class SpringMain {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext(MetaData.class); 
		
		//build an employee bean in the IOC container.
		Employee employee = (Employee)ctx.getBean("emplBean");
		employee.showDetails();
		
		ctx.close();
	}

}
