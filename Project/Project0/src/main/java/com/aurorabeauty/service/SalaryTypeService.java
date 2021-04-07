package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.SalaryType;
import com.aurorabeauty.repository.SalaryTypeRepo;

@Service
public class SalaryTypeService {
	@Autowired
	private SalaryTypeRepo repo;

	public SalaryType saveSalaryType(SalaryType salaryType) {
		return repo.save(salaryType);
	}

	public List<SalaryType> saveSalaryTypes(List<SalaryType> salaryTypes) {
		return repo.saveAll(salaryTypes);
	}

	public List<SalaryType> getSalaryTypes() {
		return repo.findAll();
	}

	public SalaryType getSalaryTypesById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<SalaryType> getSalaryTypesByName(String name) {
		return repo.findSalaryTypesByName(name);
	}
	
	public String deleteSalaryType(int id) {
		repo.deleteById(id);
		return id + "";
	}
	
	public SalaryType updateSalaryType(SalaryType salaryType) {
		SalaryType existSalaryType = repo.findById(salaryType.getId()).orElse(null);
		existSalaryType.setName(salaryType.getName());
		existSalaryType.setPresent(salaryType.getPresent());
		return repo.save(existSalaryType);
	}
}
