package com.main.service;

import java.util.List;
import java.util.Optional;

import com.main.model.Product;



public interface InvoiceServiceIntf {

	void saveProduct(Product product);

	List<Product> fetchData();

	Optional<Product> buyUsingId(int productid);

	
}
