package ioc.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		//build IOC Container with Application Contxt.
				ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/metadata.xml");
				
				//create an employee bean in the IOC container.
				Employee employee = (Employee)context.getBean("emplBean");
				
				employee.showDetails();
				
				((AbstractApplicationContext) context).close();
	}

}
