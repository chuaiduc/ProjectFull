package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.WarehouseDetail;
import com.aurorabeauty.service.WarehouseDetailService;

@RestController
@RequestMapping("api/warehouseDetail")
public class WarehouseDetailController {

	@Autowired
	private WarehouseDetailService service;
	
	@PostMapping("/add")
	public WarehouseDetail addWarehouseDetail(@RequestBody WarehouseDetail warehouseDetail) {
		return service.saveWarehouseDetail(warehouseDetail);
	}
	@PostMapping("/addmultiple")
	public List<WarehouseDetail> addWarehouseDetails(@RequestBody List<WarehouseDetail> warehouseDetails) {
		return service.saveWarehouseDetails(warehouseDetails);
	}
	@GetMapping("/all")
	public List<WarehouseDetail> getAll(){
		return service.getWarehouseDetails();
	}
}
