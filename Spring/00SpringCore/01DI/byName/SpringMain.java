package di.byName;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringMain {

	
	public static void main(String... strings) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class);
       //ProductService bean = context.getBean(ProductService.class);
        ProdController bean = context.getBean(ProdController.class);
        bean.getProducts();
    }
}
