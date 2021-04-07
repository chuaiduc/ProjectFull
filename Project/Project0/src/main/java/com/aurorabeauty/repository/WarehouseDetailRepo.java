package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.WarehouseDetail;

public interface WarehouseDetailRepo extends JpaRepository<WarehouseDetail, Integer>{
	public List<WarehouseDetail> findWarehouseDetailsByName(String name);
}
