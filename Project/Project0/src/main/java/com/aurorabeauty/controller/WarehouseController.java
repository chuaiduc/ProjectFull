package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.Warehouse;
import com.aurorabeauty.service.WarehouseService;

@RestController
@RequestMapping("api/warehouse")
public class WarehouseController {

	@Autowired
	private WarehouseService service;
	
	@PostMapping("/add")
	public Warehouse adWarehouse(@RequestBody Warehouse warehouse) {
		return service.saveWarehouse(warehouse);
	}
	@PostMapping("/addmultiple")
	public List<Warehouse> adWarehouses(@RequestBody List<Warehouse> warehouses) {
		return service.saveWarehouses(warehouses);
	}
	@GetMapping("/all")
	public List<Warehouse> getAll(){
		return service.getWarehouses();
	}
}
