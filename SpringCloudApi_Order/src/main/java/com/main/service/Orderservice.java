package com.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.main.dao.OrderRepository;
import com.main.model.Orders;

@Service
@Transactional
public class Orderservice implements OrderServiceIntf{
	@Autowired
	OrderRepository orderRepo;

	public void saveOrderDetails(Orders order) {
		orderRepo.save(order);
	}

	public List<Orders> fetchProductData() {
		return (List<Orders>) orderRepo.findAll();
	}
}
