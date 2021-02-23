package com.springboot.consumer;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.dao.IOrderDAO;
import com.springboot.dao.IOrderDetailDAO;
import com.springboot.entity.Customer;
import com.springboot.entity.Order;
import com.springboot.entity.OrderDetail;
import com.springboot.entity.Product;
import com.springboot.model.OrderDetails;
import com.springboot.model.OrderModel;

@Component
public class Consumer {
	@Autowired
	private IOrderDAO orderDao;

	@Autowired
	private IOrderDetailDAO orderDetailDAO;


	@RabbitListener(queues = "${jsa.rabbitmq.queue}", containerFactory = "jsaFactory")
	public void recievedMessage(OrderModel model) {
		Order order = this.createOrder(model);
		for (OrderDetails orderDetail : model.getOrderDetails()) {
			OrderDetail detail = new OrderDetail();
			detail.setOrder(order);
			detail.setProduct(new Product(orderDetail.getProductID()));
			detail.setUnitPrice(orderDetail.getUnitPrice());
			detail.setDiscount(orderDetail.getDiscount());
			detail.setQuantity(orderDetail.getQuantity());
			orderDetailDAO.create(detail);
		}

	}

	public Order createOrder(OrderModel model) {
		Order order = new Order();
		order.setCustomer(new Customer(model.getCustomer().getId()));
		order.setAddress(model.getAddress());
		order.setOrderDate(new Date());
		order.setAmount(model.getAmount());
		order.setDescription(model.getDescription());
		order.setStatus(model.getStatus());
		//order.setPhone(model.getPhone());
		return orderDao.create(order);
	}



}
