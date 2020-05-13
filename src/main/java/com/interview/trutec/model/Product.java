package com.interview.trutec.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {	
	
	@Setter
	@Getter
    public String productName;    
    
	@Setter
	@Getter
    public String productId;
    
	@Setter
	@Getter
    public String description;   
    
	@Setter
	@Getter
    public BigDecimal price;
	
	//INFO : not worked lombok so used manual
	public String getproductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
	public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
   
    public String getProductId() {
        return productId;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
