package com.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SingletonLazyBean {
	
	@PostConstruct
	public void init(){
		System.out.println("Lazy Singleton is loaded...");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Lazy Singleton is going down...");
	}
}
