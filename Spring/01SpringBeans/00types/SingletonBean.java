package com.beans;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class SingletonBean {
	public int x=(int)(Math.random()*100);
	
	@PreDestroy
	public void destroy(){
		System.out.println("Singleton is going down...");
	}
}
