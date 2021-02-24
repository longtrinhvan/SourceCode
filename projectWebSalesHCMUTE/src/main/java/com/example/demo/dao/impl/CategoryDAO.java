package com.example.demo.dao.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.ICategoryDAO;
import com.example.demo.entity.Category;


@Repository
public class CategoryDAO extends GeneraDAO<Category, Integer> implements ICategoryDAO {

}
