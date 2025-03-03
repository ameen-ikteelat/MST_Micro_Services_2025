package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan({"beans" , "interceptor"})
public class SpringMain {
	public static void main(String[]args) {
		// initiate IOC Container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringMain.class);



		//prototype Bean , instance is created per getBean call. 
		PrototypeBean p1=ctx.getBean("proto" ,PrototypeBean.class);
		PrototypeBean p2=ctx.getBean("proto",PrototypeBean.class);
		System.out.println("Proto 1,randnum="+p1.randnum);
		System.out.println("Proto 2,randnum="+p2.randnum);


		//singleton Bean , instance is created per Container (context)
		SingletonBean s1=ctx.getBean(SingletonBean.class);
		SingletonBean s2=ctx.getBean(SingletonBean.class);
		System.out.println("Single 1, randnum="+s1.randnum);
		System.out.println("Single 2, randnum="+s2.randnum);

		//Composed Bean include DI to prototype and Singleton
		ComposedBean c1=ctx.getBean(ComposedBean.class);
		System.out.println("composed.getProto, x="+c1.getProtoRandNum());
		System.out.println("composed.getSingle, x="+c1.getSingleRandNum());

		//another prototype bean definition
		PrototypeBean p3=ctx.getBean("proto9",PrototypeBean.class);
		System.out.println("Proto9, randnum="+p3.randnum);
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("############################");
		System.out.println("############################");
		System.out.println("###### interceptor Part #####");
		System.out.println("############################");
		System.out.println("############################");
		//postproccessor
		PrototypeBean p4=ctx.getBean("proto",PrototypeBean.class);
		
	}	

}
