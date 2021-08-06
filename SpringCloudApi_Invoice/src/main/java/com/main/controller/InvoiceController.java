package com.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Product;
import com.main.service.InvoiceServiceIntf;


@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired 
	InvoiceServiceIntf invoiceServiceIntf;
	@GetMapping("/buyUsingId/{productid}")
    public ResponseEntity<Optional<Product>> buyUsingId(@PathVariable("productid") int productid) {
        Optional<Product> option = invoiceServiceIntf.buyUsingId(productid);
        if (option.isPresent())
            return new ResponseEntity<Optional<Product>>(option, HttpStatus.OK);
        else
            return new ResponseEntity<Optional<Product>>(HttpStatus.NOT_FOUND);
        
        
        
        
}

}
