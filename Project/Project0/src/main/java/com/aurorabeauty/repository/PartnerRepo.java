package com.aurorabeauty.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.aurorabeauty.entity.Partner;


public interface PartnerRepo extends JpaRepository<Partner, Integer> {
	
	@Query(value="SELECT * FROM partner_tbl WHERE name LIKE %:name%",nativeQuery = true)
    List<Partner> findByPartnerNameContaining(String name);
}
