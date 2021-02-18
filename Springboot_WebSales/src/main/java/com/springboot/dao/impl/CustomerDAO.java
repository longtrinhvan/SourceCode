package com.springboot.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.dao.ICustomerDAO;
import com.springboot.entity.Customer;

@Repository
public class CustomerDAO extends GeneraDAO<Customer, String> implements ICustomerDAO {

	@Override
	public List<Customer> findByRoles(boolean roles) {
		String sql = "From Customer c WHERE c.admin =?0";
		return this.getResultList(sql, roles);
	}

}
