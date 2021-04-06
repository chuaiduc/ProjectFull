package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Partner;
import com.aurorabeauty.entity.Product;
import com.aurorabeauty.repository.PartnerRepo;

@Service
public class PartnerService {
	@Autowired
	private PartnerRepo repo;
	
	public Partner savePartner(Partner partner) {
		return repo.save(partner);
	}

	public List<Partner> savePartners(List<Partner> partners) {
		return repo.saveAll(partners);
	}

	public List<Partner> getPartners() {
		return repo.findAll();
	}

	public Partner getPartnerById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Partner> getPartnersByName(String name){
		return repo.findPartnersByName(name);
	}
	
	public String deletePartner(int id) {
		repo.deleteById(id);
		return id+"";
	}
	
	public Partner updatePartner(Partner partner) {
		Partner existPartner=repo.findById(partner.getId()).orElse(null);
		existPartner.setName(partner.getName());
		existPartner.setEmail(partner.getEmail());
		existPartner.setPhone(partner.getPhone());
		existPartner.setAddress(partner.getAddress());
		return repo.save(existPartner);
	}
}
