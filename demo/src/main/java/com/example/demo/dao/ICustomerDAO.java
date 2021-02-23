package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Customer;

public interface ICustomerDAO extends IGeneralDAO<Customer, String> {
	List<Customer> findByRoles(boolean roles);

}
