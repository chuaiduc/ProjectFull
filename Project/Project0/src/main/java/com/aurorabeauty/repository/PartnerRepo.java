package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aurorabeauty.entity.Partner;

public interface PartnerRepo extends JpaRepository<Partner, Integer> {
	public List<Partner> findPartnersByName(String name);
}
