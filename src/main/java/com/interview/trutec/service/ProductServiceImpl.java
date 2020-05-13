package com.interview.trutec.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.interview.trutec.model.Configuration;
import com.interview.trutec.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Override
	public List<Product> getproductdetails() {
		List<Product> productList = new ArrayList<>();
		Product product = new Product();
		product.setDescription("sample");
		product.setPrice(BigDecimal.TEN);
		product.setProductId("P01");
		product.setProductName("Test");
		productList.add(product);
		return productList;
	}
	
	@Override
	public List<Configuration> getConfigdetails() {
		List<Configuration> productList = new ArrayList<>();
		Configuration configuration = new Configuration();
		configuration.setapplicationName("True Tec");
		configuration.setpassword("pwd");
		configuration.setusername("user");
		configuration.setversion("v1");
		productList.add(configuration);
		return productList;
	}

}
