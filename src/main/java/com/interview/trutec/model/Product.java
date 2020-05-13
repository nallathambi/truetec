package com.interview.trutec.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;

public class Product {
	
	
    @ApiModelProperty(notes = "The database generated product ID")
    private String productName;    
    
    
    @ApiModelProperty(notes = "The application-specific product ID")
    private String productId;
    
    @ApiModelProperty(notes = "The product description")
    private String description;
    
    @ApiModelProperty(notes = "The image URL of the product")
    private String imageUrl;
    
    @ApiModelProperty(notes = "The price of the product", required = true)
    private BigDecimal price;

}
