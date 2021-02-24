package com.example.demo.dao.impl;

import org.springframework.stereotype.Service;

import com.example.demo.dao.IOrderDetailDAO;
import com.example.demo.entity.OrderDetail;
@Service
public class OrderDetailDAO extends GeneraDAO<OrderDetail, Integer> implements IOrderDetailDAO{

}
