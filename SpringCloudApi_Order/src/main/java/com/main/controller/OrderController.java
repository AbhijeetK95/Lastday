package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Orders;
import com.main.service.OrderServiceIntf;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderServiceIntf orderSer;

	@PostMapping("/saveOrder")
	public ResponseEntity<String> saveRegister(@RequestBody Orders order) {
		orderSer.saveOrderDetails(order);
		return new ResponseEntity<String>("Order Added Successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/getOrder")
    public ResponseEntity<List<Orders>> fetchData() {
        List<Orders> list = orderSer.fetchProductData();
        if (list.size() == 0) {
            return new ResponseEntity<List<Orders>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Orders>>(list, HttpStatus.OK);
    }
	
	
	
	/*@GetMapping("/saveOrder/{productid}")
	public ResponseEntity<String> saveRegister(@PathVariable String productid) {
		
		System.out.println("prodid====="+productid);
		//orderSer.saveOrderDetails(order);
		return new ResponseEntity<String>("Order Added Successfully", HttpStatus.CREATED);
	}*/
	
	

}
