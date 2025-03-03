package com.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComposedBean {
	//@Autowired
	//@Qualifier("proto6")
	private PrototypeBean proto;
	//@Autowired
	private SingletonBean single;
	
	public ComposedBean(PrototypeBean proto, SingletonBean single){
		this.proto=proto;
		this.single=single;
	}
	
	public int getProtoX(){
		return proto.x;
	}
	
	public int getSingleX(){
		return single.x;
	}
	
	public void show(){
		System.out.println("@@@");
	}
}
