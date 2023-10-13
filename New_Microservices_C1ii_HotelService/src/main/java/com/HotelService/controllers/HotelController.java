package com.HotelService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HotelService.entities.Hotel;
import com.HotelService.services.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired HotelService hotServ;
	
	
	// get single
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable("hotelId") int hotelId)
	{
		return ResponseEntity.status(HttpStatus.OK).body(hotServ.get(hotelId));
	}
	
	
	// get all
	@GetMapping("/all")
	public ResponseEntity<List<Hotel>> getAllHotels()
	{
		return ResponseEntity.ok(hotServ.getAll());
	}
	
	
	
	

}
