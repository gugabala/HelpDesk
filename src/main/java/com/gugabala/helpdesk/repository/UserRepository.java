package com.gugabala.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gugabala.helpdesk.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);

}