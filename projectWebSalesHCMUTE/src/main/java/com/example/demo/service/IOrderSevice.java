package com.example.demo.service;

import com.example.demo.entity.Order;

public interface IOrderSevice extends IGeneralService<Order, Integer> {
//	Order createOrder();
//	List<Order> getAllOrderByUser();
	Order findById(Integer id);
//	Map<Integer, Product> getPurchasedItems();
}
