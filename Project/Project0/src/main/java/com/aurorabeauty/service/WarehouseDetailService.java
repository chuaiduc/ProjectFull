package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.WarehouseDetail;
import com.aurorabeauty.repository.WarehouseDetailRepo;

@Service
public class WarehouseDetailService {

	@Autowired
	private WarehouseDetailRepo repo;
	
	public WarehouseDetail saveWarehouseDetail(WarehouseDetail detail) {
		return repo.save(detail);
	}
	
	public List<WarehouseDetail> saveWarehouseDetails(List<WarehouseDetail> details) {
		return repo.saveAll(details);
	}
	
	public List<WarehouseDetail> getWarehouseDetails() {
		return repo.findAll();
	}
	
	public WarehouseDetail getWarehouseDetailById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<WarehouseDetail> getWarehouseDetailsByName(String name) {
		return repo.findWarehouseDetailsByName(name);
	}
	
	public String deleteWarehouseDetail(int id) {
		repo.deleteById(id);
		return id + "";
	}
	
	public WarehouseDetail updateWarehouseDetail(WarehouseDetail detail) {
		WarehouseDetail existWarehouseDetail = repo.findById(detail.getId()).orElse(null);
		existWarehouseDetail.setQuantity(detail.getQuantity());
		existWarehouseDetail.setProduct(detail.getProduct());
		return repo.save(existWarehouseDetail);
	}
}
