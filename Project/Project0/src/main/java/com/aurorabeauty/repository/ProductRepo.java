package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {
	public List<Product> findProductsByName(String name);
}
