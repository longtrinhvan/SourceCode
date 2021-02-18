package com.springboot.service;

import java.util.List;

import com.springboot.entity.Category;

public interface ICategoryService extends IGeneralService<Category, Integer> {
	List<Category> getRamDomByCategory();
}
