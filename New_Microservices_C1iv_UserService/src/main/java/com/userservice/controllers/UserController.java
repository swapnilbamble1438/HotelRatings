package com.userservice.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.entities.User;
import com.userservice.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServ;
	
	
	
	// get single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable("userId") int userId)
	{
		User user = userServ.getUser(userId);
					
		
		return ResponseEntity.ok(user);
		
	}
	
	// get all users
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> allUsers = userServ.getAllUser();
				
		return ResponseEntity.ok(allUsers);
	}
	
	
	//
	@GetMapping("/hello")
	public String getString()
	{
		return "Hello, This Api is working fine";
	}
	

}
