package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.ProductType;
import com.aurorabeauty.service.ProductTypeService;

@RestController
@RequestMapping("api/producttype")
public class ProductTypeController {

	@Autowired
	private ProductTypeService service;
	@PostMapping("/addproducttype")
	public ProductType addProductType(@RequestBody ProductType productType) {
		return service.saveProductType(productType);
	}
	@PostMapping("/addproducttypes")
	public List<ProductType> addProductTypes(@RequestBody List<ProductType> productTypes) {
		return service.saveProductTypes(productTypes);
	}
	@GetMapping("/all")
	public List<ProductType> getAll(){
		return service.getProductTypes();
	}
	
}
