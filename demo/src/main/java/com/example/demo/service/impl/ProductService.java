package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IProductDAO;
import com.example.demo.entity.Product;
import com.example.demo.service.IProductService;

@Service
public class ProductService extends GeneralService<Product, Integer>implements IProductService {

	@Autowired
	private IProductDAO dao;

	@Override
	public List<Product> findByKeywords(String keyWords) {
		return dao.findByKeywords(keyWords);
	}

	@Override
	public List<Product> findAllProductByCategory(int id) {
		return dao.findByCategoryId(id);
	}

	@Override
	public List<Product> findByHot(String key) {
		return dao.findItemByHot(key);
	}

	@Override
	public List<Product> findByIdsInCookie(String ids) {
		return dao.findByIdsInCookie(ids);
	}



}
