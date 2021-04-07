package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.Staff;

public interface StaffRepo extends JpaRepository<Staff, Integer>{
	public List<Staff> findStaffsByName(String name);
}
