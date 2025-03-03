package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mst.controller.ProductController;

@Configuration
@ComponentScan({"com.mst"})
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cotext = new AnnotationConfigApplicationContext(Main.class);
		
		ProductController bean = cotext.getBean(ProductController.class);
	}

}
