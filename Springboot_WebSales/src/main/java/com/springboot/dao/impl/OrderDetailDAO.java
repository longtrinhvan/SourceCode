package com.springboot.dao.impl;

import org.springframework.stereotype.Service;

import com.springboot.dao.IOrderDetailDAO;
import com.springboot.entity.OrderDetail;
@Service
public class OrderDetailDAO extends GeneraDAO<OrderDetail, Integer> implements IOrderDetailDAO{

}
