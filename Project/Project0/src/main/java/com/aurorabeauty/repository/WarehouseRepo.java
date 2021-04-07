package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.Warehouse;

public interface WarehouseRepo extends JpaRepository<Warehouse, Integer>{
	public List<Warehouse> findWarehousesByName(String name);
}
