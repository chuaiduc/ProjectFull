package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.Product;
import com.aurorabeauty.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	@Autowired
	private ProductService service;
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	@PostMapping("/addmultiple")
	public List<Product> addProducts(@RequestBody List<Product> products) {
		return service.saveProducts(products);
	}
	@GetMapping("/all")
	public List<Product> getAll(){
		return service.getProducts();
	}
}
