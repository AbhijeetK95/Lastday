package com.main.service;

import java.util.List;

import com.main.model.Orders;

public interface OrderServiceIntf {
	
	
	void saveOrderDetails(Orders order);

	List<Orders> fetchProductData();


}
