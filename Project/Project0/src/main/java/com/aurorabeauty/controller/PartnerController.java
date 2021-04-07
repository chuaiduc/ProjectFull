package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.Partner;
import com.aurorabeauty.service.PartnerService;

@RestController
@RequestMapping("api/partner")
public class PartnerController {
	@Autowired
	private PartnerService service;
	
	@PostMapping("/add")
	public Partner addPartner(@RequestBody Partner partner) {
		return service.savePartner(partner);
	}
	@PostMapping("/addmultiple")
	public List<Partner> addPartners(@RequestBody List<Partner> partners) {
		return service.savePartners(partners);
	}
	@GetMapping("/all")
	public List<Partner> getAll(){
		return service.getPartners();
	}
}
