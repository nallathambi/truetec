package com.interview.trutec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.interview.trutec.model.Configuration;
import com.interview.trutec.model.Product;
import com.interview.trutec.service.ProductService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/product/api")
public class ProductController {
	
	@Autowired
	private ProductService productService;	
    
    @ApiOperation(value = "View a list of available products",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/getproductdetails", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Product>> getproductdetails(Model model){
        List<Product> productList = productService.getproductdetails();
        if(productList.isEmpty()) {
        	return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<List<Product>>(productList, HttpStatus.OK);
    }
    
    @ApiOperation(value = "View a list of available configurations",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )    
    @RequestMapping(value = "/getconfigdetails", method= RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Configuration>> getconfigdetails(Model model){
        List<Configuration> configList = productService.getConfigdetails();
        if(configList.isEmpty()) {
        	return new ResponseEntity<List<Configuration>>(HttpStatus.NO_CONTENT);        	
        }
        return new ResponseEntity<List<Configuration>>(configList, HttpStatus.OK);
    }  
    
}
