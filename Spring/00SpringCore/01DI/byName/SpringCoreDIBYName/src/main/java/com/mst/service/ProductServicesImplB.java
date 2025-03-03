package com.mst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mst.model.Product;

@Service()
public class ProductServicesImplB implements ProductService{
	public List<Product> listProducts() {
		ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("B1 Product"));
        products.add(new Product("B2 Product"));
		return products;
	}
}
