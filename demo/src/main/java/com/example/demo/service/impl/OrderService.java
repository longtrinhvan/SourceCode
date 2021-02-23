package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IOrderDAO;
import com.example.demo.entity.Order;
import com.example.demo.service.IOrderSevice;

@Service
public class OrderService extends GeneralService<Order, Integer> implements IOrderSevice {



	@Autowired
	private IOrderDAO orderDAO;


	@Override
	public Order findById(Integer id) {
		return orderDAO.findById(id);
	}


}
