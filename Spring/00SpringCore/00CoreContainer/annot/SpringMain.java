package ioc.annot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ioc.annot"})
public class SpringMain {
	
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class);
		
		Employee emp = (Employee) context.getBean("employeeBean");
		
		emp.showDetails();
		
		context.close();
	}

}



