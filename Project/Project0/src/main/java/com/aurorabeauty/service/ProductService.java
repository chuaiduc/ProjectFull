package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Product;
import com.aurorabeauty.repository.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo repo;

	public Product saveProduct(Product product) {
		return repo.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return repo.saveAll(products);
	}

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Product> getProductsByName(String name){
		return repo.findProductsByName(name);
	}
	
	public String deleteProduct(int id) {
		repo.deleteById(id);
		return id+"";
	}
	
	public Product updateProduct(Product product) {
		Product existProduct=repo.findById(product.getId()).orElse(null);
		existProduct.setName(product.getName());
		existProduct.setPrice(product.getPrice());
		existProduct.setPartner(product.getPartner());
		existProduct.setProductType(product.getProductType());
		existProduct.setQuantity(product.getQuantity());
		return repo.save(existProduct);
		
		
	}

}
