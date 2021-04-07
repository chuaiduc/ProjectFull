package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Staff;
import com.aurorabeauty.repository.StaffRepo;

@Service
public class StaffService {
	@Autowired
	private StaffRepo repo;

	public Staff saveStaff(Staff staff) {
		return repo.save(staff);
	}
	
	public List<Staff> saveStaffs(List<Staff> staff) {
		return repo.saveAll(staff);
	}
	
	public List<Staff> getStaffs() {
		return repo.findAll();
	}
	
	public Staff getStaffById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Staff> getStaffsByName(String name) {
		return repo.findStaffsByName(name);
	}
	
	public String deleteStaff(int id) {
		repo.deleteById(id);
		return id + "";
	}
	
	public Staff updateStaff(Staff staff) {
		Staff existStaff = repo.findById(staff.getId()).orElse(null);
		existStaff.setName(staff.getName());
		existStaff.setAddress(staff.getAddress());
		existStaff.setUsername(staff.getUsername());
		existStaff.setPassword(staff.getPassword());
		existStaff.setPhone(staff.getPhone());
		existStaff.setEmail(staff.getEmail());
		existStaff.setGender(staff.isGender());
		existStaff.setBirthday(staff.getBirthday());
		existStaff.setSalary(staff.getSalary());
		existStaff.setSalaryType(staff.getSalaryType());
		return repo.save(existStaff);
	}
}
