package ioc.clas;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ioc.clas.Address;

@Configuration
public class MetaData {

	@Bean
	public Employee emplBean()
	{
		return new Employee(10800, "Mike Smith",address());
	}
	
	@Bean 
	public Address address()
	{
		return new Address("Hadera", "Haifa", "Israel");
	}
	
}
