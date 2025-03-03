package com.mst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.mst.service.ProductService;

@Component("ProductController")
public class ProductController {
	
	@Autowired
	//@Qualifier("B")
	private ProductService productService ;
	
	

}
