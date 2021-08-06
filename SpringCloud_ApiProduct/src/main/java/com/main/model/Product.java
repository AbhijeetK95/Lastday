package com.main.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ProductTB")
public class Product
{
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "pro_id")
	 private int productid;
	 private String product_name;
	 private long product_price;
	 
	 
	 
	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public long getProduct_price() {
		return product_price;
	}
	public void setProduct_price(long product_price) {
		this.product_price = product_price;
	}


	public Product(int productid, String product_name, long product_price) {
		super();
		this.productid = productid;
		this.product_name = product_name;
		this.product_price = product_price;
	}


	
	public String toString() {
		return "Product [productid=" + productid + ", product_name=" + product_name + ", product_price=" + product_price
				+ "]";
	}

	public Product() {
		
	}
	
	
	
	
	
	 
	 
	 
	 
	 
	
	    
	     
}