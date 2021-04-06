package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.ProductType;

public interface ProductTypeRepo extends JpaRepository<ProductType, Integer> {
	public List<ProductType> findProductTypesByName(String name);
}
