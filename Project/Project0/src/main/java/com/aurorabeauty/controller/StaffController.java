package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.Staff;
import com.aurorabeauty.service.StaffService;

@RestController
@RequestMapping("api/staff")
public class StaffController {
	@Autowired
	private StaffService service;
	
	@PostMapping("/add")
	public Staff addStaff(@RequestBody Staff staff) {
		return service.saveStaff(staff);
	}
	@PostMapping("/addmultiple")
	public List<Staff> addStaffs(@RequestBody List<Staff> staffs) {
		return service.saveStaffs(staffs);
	}
	@GetMapping("/all")
	public List<Staff> getAll(){
		return service.getStaffs();
	}
}
