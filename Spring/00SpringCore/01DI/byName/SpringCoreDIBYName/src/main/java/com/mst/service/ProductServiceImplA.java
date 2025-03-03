package com.mst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mst.model.Product;

@Service()
public class ProductServiceImplA implements ProductService{

	@Override
	public List<Product> listProducts() {
		ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("Product A1"));
        products.add(new Product("Product A2"));
		return products;
	}

}
