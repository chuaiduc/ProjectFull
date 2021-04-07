package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.SalaryType;

public interface SalaryTypeRepo extends JpaRepository<SalaryType, Integer>{
	public List<SalaryType> findSalaryTypesByName(String name);
}
