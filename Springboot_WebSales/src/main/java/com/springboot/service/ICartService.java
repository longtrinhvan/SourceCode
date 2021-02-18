package com.springboot.service;

import java.util.Collection;

import com.springboot.entity.Product;

public interface ICartService {
	void addCart(Integer id);
	void removeCart(Integer id);
	void updateCart(Integer id, int qty);
	void clear();
	int getCountCart();
	double getAmountCart();
	Collection<Product> getItemsCart();
	
	

}
