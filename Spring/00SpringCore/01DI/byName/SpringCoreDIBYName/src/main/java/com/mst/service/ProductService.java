package com.mst.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mst.model.*;

public interface ProductService {
	List<Product> listProducts();
}
