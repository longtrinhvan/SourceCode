package com.springboot.service;

import java.util.List;

import com.springboot.entity.Customer;

public interface IAccountService extends IGeneralService<Customer, String> {
	boolean sendActivedUser(Customer user);
	void updateUser(Customer user);
	List<Customer> findByRoles(boolean admin);

}
