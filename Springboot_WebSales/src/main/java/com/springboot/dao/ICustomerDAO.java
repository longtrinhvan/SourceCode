package com.springboot.dao;

import java.util.List;

import com.springboot.entity.Customer;

public interface ICustomerDAO extends IGeneralDAO<Customer, String> {
	List<Customer> findByRoles(boolean roles);

}
