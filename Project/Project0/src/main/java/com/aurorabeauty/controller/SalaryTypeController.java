package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.SalaryType;
import com.aurorabeauty.service.SalaryTypeService;

@RestController
@RequestMapping("api/salaryType")
public class SalaryTypeController {
	@Autowired
	private SalaryTypeService service;
	
	@PostMapping("/add")
	public SalaryType addSalaryType(@RequestBody SalaryType salaryType) {
		return service.saveSalaryType(salaryType);
	}
	@PostMapping("/addmultiple")
	public List<SalaryType> addSalaryTypes(@RequestBody List<SalaryType> salaryTypes) {
		return service.saveSalaryTypes(salaryTypes);
	}
	@GetMapping("/all")
	public List<SalaryType> getAll(){
		return service.getSalaryTypes();
	}
}
