package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.impl.InstructorDao;
import com.example.demo.util.Instructor;

@Controller
public class HomeController {

	@Autowired
	public InstructorDao instructorDao;

	@RequestMapping("/home")
	public String listCustomer() {
		List<Instructor> a = instructorDao.findAll();
		for (Instructor x : a) {
			System.out.println(x.getEmail());
		}
		return "customer-list";
	}

}
