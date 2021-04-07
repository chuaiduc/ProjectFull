package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Warehouse;
import com.aurorabeauty.repository.WarehouseRepo;

@Service
public class WarehouseService {
	
	@Autowired
	private WarehouseRepo repo;
	
	public Warehouse saveWarehouse(Warehouse warehouse) {
		return repo.save(warehouse);
	}
	
	public List<Warehouse> saveWarehouses(List<Warehouse> warehouse) {
		return repo.saveAll(warehouse);
	}
	
	public List<Warehouse> getWarehouses() {
		return repo.findAll();
	}
	
	public Warehouse getWarehouseById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Warehouse> getWarehousesByName(String name) {
		return repo.findWarehousesByName(name);
	}
	
	public String deleteWarehouse(int id) {
		repo.deleteById(id);
		return id + "";
	}
	
	public Warehouse updateWarehouse(Warehouse warehouse) {
		Warehouse exisWarehouse = repo.findById(warehouse.getId()).orElse(null);
		exisWarehouse.setDate(warehouse.getDate());
		exisWarehouse.setStatus(warehouse.getStatus());
		exisWarehouse.setDescription(warehouse.getDescription());
		exisWarehouse.setPartner(warehouse.getPartner());
		exisWarehouse.setStaff(warehouse.getStaff());
		return repo.save(exisWarehouse);
	}
}
