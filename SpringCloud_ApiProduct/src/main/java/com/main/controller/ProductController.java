package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Product;
import com.main.service.ProductServiceIntf;



@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired 
	ProductServiceIntf productServiceIntf;
	
	
	
	@PostMapping("/saveProduct")
    public ResponseEntity<String> saveRegister(@RequestBody Product product) {
		productServiceIntf.saveProduct(product);
        return new ResponseEntity<String>("Product Added Successfully", HttpStatus.CREATED);
    }
	
	@GetMapping("/fetchData")
	public List<Product> fetchData()
	{
		List<Product> list = productServiceIntf.fetchData();
		return list;
	}
	
	
	@GetMapping("/buyUsingId/{productid}")
    public ResponseEntity<Optional<Product>> buyUsingId(@PathVariable("productid") int productid) {
        Optional<Product> option = productServiceIntf.buyUsingId(productid);
        if (option.isPresent())
            return new ResponseEntity<>(option, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        
        
        
        
}
	
	
	
	
	/* @GetMapping("/test")
	    public Map test() {
	         String url = "http://localhost:8078/order/saveOrder/{urlParameter}";
	 
	        RestTemplate template = new RestTemplate();
	 
	        HttpHeaders headers = new HttpHeaders();
	        HttpEntity requestEntity = new HttpEntity<>(headers);
	 
	        Map uriVariables = new HashMap<>();
	        
	 
	        uriVariables.put("urlParameter", 2);
	        //uriVariables.put("queryParameter", "myQueryParameter");
	 
	        ResponseEntity response = template.exchange(url, HttpMethod.GET, requestEntity, Map.class, uriVariables);
	 
	         
	        return (Map) response.getBody();
	    }*/
	
	
	
	
	
}
