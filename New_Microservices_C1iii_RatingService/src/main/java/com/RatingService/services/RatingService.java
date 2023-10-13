package com.RatingService.services;

import java.util.List;

import com.RatingService.entities.Rating;

public interface RatingService{

	
	
	
	
	
	// gel all ratings
	List<Rating> getAllRatings();
	
	
	
	// get all by hid
	List<Rating> getRatingByHid(int hotelId);
	
}

