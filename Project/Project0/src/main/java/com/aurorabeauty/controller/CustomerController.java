package com.aurorabeauty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aurorabeauty.entity.Customer;
import com.aurorabeauty.service.CustomerService;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.saveCustomer(customer);
	}
	@PostMapping("/addmultiple")
	public List<Customer> addCustomers(@RequestBody List<Customer> customers) {
		return service.saveCustomers(customers);
	}
	@GetMapping("/all")
	public List<Customer> getAll(){
		return service.getCustomers();
	}
}
