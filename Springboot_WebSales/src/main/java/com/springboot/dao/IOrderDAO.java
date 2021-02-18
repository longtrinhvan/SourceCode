package com.springboot.dao;

import java.util.List;

import com.springboot.entity.Customer;
import com.springboot.entity.Order;
import com.springboot.service.impl.CartService;

public interface IOrderDAO extends IGeneralDAO<Order, Integer> {

	void create(Order o, CartService cart);
	List<Order> findByUser(Customer user);

}
