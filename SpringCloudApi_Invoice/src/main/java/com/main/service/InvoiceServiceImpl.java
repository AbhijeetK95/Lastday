package com.main.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.dao.ProductRepository;
import com.main.model.Product;



@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceServiceIntf {

	@Autowired
	ProductRepository repo;
	
	public void saveProduct(Product product) {
		repo.save(product);		
	}

	public List<Product> fetchData() {
		
		return repo.findAll();
	}


	public Optional<Product> buyUsingId(int productid) {
		
		return repo.findById(productid);
	}

}
