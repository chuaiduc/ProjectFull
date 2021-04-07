package com.aurorabeauty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurorabeauty.entity.Customer;
import com.aurorabeauty.repository.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo repo;
	
	public Customer saveCustomer(Customer customer) {
		return repo.save(customer);
	}
	
	public List<Customer> saveCustomers(List<Customer> customers) {
		return repo.saveAll(customers);
	}
	
	public List<Customer> getCustomers() {
		return repo.findAll();
	}
	
	public Customer getCustomerById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Customer> getCustomersByName(String name) {
		return repo.findCustomersByName(name);
	}
	
	public String deleteCustomer(int id) {
		repo.deleteById(id);
		return id + "";
	}
	
	public Customer updateCustomer(Customer customer) {
		Customer existCustomer = repo.findById(customer.getId()).orElse(null);
		existCustomer.setName(customer.getName());
		existCustomer.setAddress(customer.getAddress());
		existCustomer.setAddress2(customer.getAddress2());
		existCustomer.setAddress3(customer.getAddress3());
		existCustomer.setPhone(customer.getPhone());
		existCustomer.setEmail(customer.getEmail());
		existCustomer.setPassword(customer.getPassword());
		existCustomer.setBirthday(customer.getBirthday());
		return repo.save(existCustomer);
	}
}
