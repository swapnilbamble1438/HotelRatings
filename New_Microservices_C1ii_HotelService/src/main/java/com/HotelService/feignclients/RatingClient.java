package com.HotelService.feignclients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.HotelService.entities.Rating;



@FeignClient(name="RATING-SERVICE")
public interface RatingClient {
	
	@GetMapping("/rating/all")
	public ResponseEntity<List<Rating>> getAllRatings();
	
	@GetMapping("/rating/hotel/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHid(@PathVariable("hotelId") int hotelId);
	
	
}
