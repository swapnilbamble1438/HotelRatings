package com.userservice.services;

import java.util.List;

import com.userservice.entities.User;

public interface UserService {
	

	
	// get all user
	List<User> getAllUser();
	
	//get single user
	User getUser(int userId);
	
	
	
	
	

}