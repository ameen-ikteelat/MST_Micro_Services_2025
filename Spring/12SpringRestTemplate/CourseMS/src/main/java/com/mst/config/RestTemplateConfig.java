package com.mst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate() ;
	}
}


// 1. XML 
// 2. anntoation  ( @Component , @Controller )
// 3. Java code