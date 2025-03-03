package com.mst.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.mst.aspect.LogginAspect;
import com.mst.bean.*;

@EnableAspectJAutoProxy
@Configuration
//@ComponentScan
public class Config {
	
	@Bean
	public Account account()
	{
		return new Account("111223", 1000.0);	
		
	}
	
	@Bean
	public LogginAspect logginAspect()
	{
		return new LogginAspect();
	}
}
