package com.example.demo.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Product;
import com.example.demo.service.IProductService;

@Controller
@RequestMapping("/admin/product/")
public class ProductsAdminController {
	@Autowired
	private IProductService productService;

	@RequestMapping("index")
	public String index(Model model) {
		model.addAttribute("product", new Product());
		model.addAttribute("list", productService.findAll());
		return "admin/product/index";
	}

	@RequestMapping("edit/{id}")
	public String edit(Model model, @PathVariable("id") Integer id) {
		model.addAttribute("product", productService.findById(id));
		model.addAttribute("list", productService.findAll());
		return "admin/product/index";
	}
}
