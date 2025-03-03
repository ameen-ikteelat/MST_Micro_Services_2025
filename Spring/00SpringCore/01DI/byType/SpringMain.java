package di.dataMember;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"di.dataMember"})
public class SpringMain {
	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class);
		Car car1 = (Car) context.getBean("CarBean");
		car1.toString();
		context.close();
		
	}

}
