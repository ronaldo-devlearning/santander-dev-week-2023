package com.devlearning.service;

import com.devlearning.domain.model.User;

public interface UserService {

	User findById(Long id);
	
	User create(User userToCreate);
	
}
