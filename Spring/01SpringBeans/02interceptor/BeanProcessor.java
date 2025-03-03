package com.intercept;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.beans.PrototypeBean;

@Component
public class BeanProcessor implements BeanPostProcessor {
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof com.beans.PrototypeBean ){
			if(((PrototypeBean)bean).x%2!=0){
				System.out.println("Bean Post Processor is about to update PrototypeBean.x to be even, current value is: "+((PrototypeBean)bean).x);
				while(((PrototypeBean)bean).x%2!=0){
					((PrototypeBean)bean).x=(int)(Math.random()*100);
				}
			}
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof com.beans.PrototypeBean){
			System.out.println("Bean Post Processor report: PrototypeBean.x is even - "+((PrototypeBean)bean).x);
			//flag=false;
		}
		return bean;
	}

}
