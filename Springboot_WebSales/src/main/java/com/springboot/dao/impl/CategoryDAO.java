package com.springboot.dao.impl;

import org.springframework.stereotype.Repository;

import com.springboot.dao.ICategoryDAO;
import com.springboot.entity.Category;


@Repository
public class CategoryDAO extends GeneraDAO<Category, Integer> implements ICategoryDAO {

}
