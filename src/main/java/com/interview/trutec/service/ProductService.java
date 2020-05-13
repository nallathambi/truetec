package com.interview.trutec.service;



import java.util.List;

import com.interview.trutec.model.Configuration;
import com.interview.trutec.model.Product;

public interface ProductService {
	
	List<Product> getproductdetails();
	
	List<Configuration> getConfigdetails();

}
