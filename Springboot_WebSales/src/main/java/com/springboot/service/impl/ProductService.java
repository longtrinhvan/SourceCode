package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.IProductDAO;
import com.springboot.entity.Product;
import com.springboot.service.ICookieService;
import com.springboot.service.IProductService;

@Service
public class ProductService extends GeneralService<Product, Integer>implements IProductService {

	@Autowired
	private IProductDAO dao;

	@Autowired
	private ICookieService cookieService;

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
	public List<Product> getViewProduct(String name, String id) {
		String ids = cookieService.getCookieValue(name, id.toString());
		if (!ids.contains(id.toString())) { 
			ids += "," + id.toString();
		}
		cookieService.createCookie(name, ids, 15);
		return dao.findByIdsInCookie(ids); 
	}

	@Override
	public List<Product> getFaVoProduct(String name, String id) {
		String favos = cookieService.getCookieValue(name, "");
		if (favos.length() > 0) 
		{
			return dao.findByIdsInCookie(favos); 
		} else
			return null;
	}


	@Override
	public List<Product> findByIdsInCookie(String ids) {
		return dao.findByIdsInCookie(ids);
	}



}
