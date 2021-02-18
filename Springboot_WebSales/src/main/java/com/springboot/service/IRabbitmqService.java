package com.springboot.service;

import com.springboot.entity.Order;
import com.springboot.service.impl.CartService;

public interface IRabbitmqService {
	public void converToSendRabbit(Order o, CartService cart);

}
