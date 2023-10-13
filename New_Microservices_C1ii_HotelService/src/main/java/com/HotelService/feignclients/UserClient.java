package com.HotelService.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.HotelService.entities.User;


@FeignClient(name="USER-SERVICE")
public interface UserClient {
	
	
	@GetMapping("/user/all")
	public ResponseEntity<List<User>> getAllUser();
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable("userId") int userId);

}
