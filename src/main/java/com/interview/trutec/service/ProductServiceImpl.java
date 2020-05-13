package com.interview.trutec.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.trutec.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Override
	public List<Product> getproductdetails() {
		List<Product> productList = new ArrayList<>();
		Product product = new Product();
		productList.add(product);
		return productList;
	}

}
