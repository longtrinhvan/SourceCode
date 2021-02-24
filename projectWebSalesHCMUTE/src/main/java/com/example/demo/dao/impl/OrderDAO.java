package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.dao.IOrderDAO;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;

@Repository
public class OrderDAO extends GeneraDAO<Order, Integer> implements IOrderDAO {


	@Override
	public List<Order> findByUser(Customer user) {
		String sql = "FROM Order o WHERE o.customer.id=?0 ORDER BY o.orderDate DESC";
		return this.getResultList(sql, user.getId());
	}

}
