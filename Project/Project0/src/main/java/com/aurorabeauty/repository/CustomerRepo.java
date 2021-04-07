package com.aurorabeauty.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;import com.aurorabeauty.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
	public List<Customer> findCustomersByName(String name);
}
