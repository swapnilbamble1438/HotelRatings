package com.userservice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.userservice.entities.User;
import com.userservice.exceptions.ResourceNotFoundException;
import com.userservice.services.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	private static List<User> users = new ArrayList<>();
	
	static {
		
		users.add(new User(1,"Swapnil Bamble","swapnil@gmail.com","I am a Springboot Developer"));
		users.add(new User(2,"Yash More","yash@gmail.com","I am a Salesforce Developer"));
		users.add(new User(3,"Pratik Shinde","pratik@gmail.com","I am a PHP Developer"));
		users.add(new User(4,"Zurez Malik","zurez@gmail.com","I am a Python Developer"));
		users.add(new User(5,"Deepak Sawant","deepak@gmail.com","I am a Java Developer"));
	}



	@Override
	public List<User> getAllUser() {
		
		return users;
	}

	@Override
	public User getUser(int userId) {
		
		
		return users.stream().filter(r-> r.getUid() == userId).findFirst()
				.orElseThrow(() 
						-> new ResourceNotFoundException(
								"User with given id: "+userId+" is not found on server !!"
								));
		
	}

}

