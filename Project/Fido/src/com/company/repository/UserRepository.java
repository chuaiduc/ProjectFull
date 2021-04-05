package com.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
