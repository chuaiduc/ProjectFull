package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Partner;
import com.aurorabeauty.entity.ProductType;
import com.aurorabeauty.repository.ProductTypeRepo;

@Service
public class ProductTypeService {
	@Autowired
	private ProductTypeRepo repo;
	
	public ProductType saveProductType(ProductType productType) {
		return repo.save(productType);
	}

	public List<ProductType> saveProductTypes(List<ProductType> productTypes) {
		return repo.saveAll(productTypes);
	}

	public List<ProductType> getProductTypes() {
		return repo.findAll();
	}

	public ProductType getProductTypeById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<ProductType> getProductTypesByName(String name){
		return repo.findProductTypesByName(name);
	}
	
	public String deleteProductType(int id) {
		repo.deleteById(id);
		return id+"";
	}
	
	public ProductType updateProductType(ProductType productType) {
		ProductType existProductType=repo.findById(productType.getId()).orElse(null);
		existProductType.setName(productType.getName());
		return repo.save(existProductType);
	}
}
