package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;

public interface IOrderDAO extends IGeneralDAO<Order, Integer> {

	List<Order> findByUser(Customer user);

}
