package com.beans;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class PrototypeBean {
	
	public int x=(int)(Math.random()*100);
	
	@PostConstruct
	public void init() {
		System.out.println("Inside init method "+x );
	}
}