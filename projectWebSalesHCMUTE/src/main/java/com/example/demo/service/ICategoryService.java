package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Category;

public interface ICategoryService extends IGeneralService<Category, Integer> {
	List<Category> getRamDomByCategory();
}
