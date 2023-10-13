package com.RatingService.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.RatingService.entities.Rating;
import com.RatingService.services.RatingService;

@Service
public class RatingServiceImpl implements RatingService{
	
	
	private static List<Rating> ratings = new ArrayList<>();
	
	static {
		
		ratings.add(new Rating(1,1,1,5,"Best Service"));
		ratings.add(new Rating(2,1,2,4,"Good Food"));
		ratings.add(new Rating(3,2,3,4,"Amazing Staff"));
		ratings.add(new Rating(4,2,4,3,"Wonderful Experience"));
		ratings.add(new Rating(5,3,5,2,"Worst experience, AC was broken"));
		ratings.add(new Rating(6,3,1,4,"The Food was so delicious"));
		ratings.add(new Rating(7,4,2,3,"Hotel is very clean"));
		ratings.add(new Rating(8,4,3,4,"Rooms were very Luxurious"));
		ratings.add(new Rating(9,5,4,4,"Phone call service is very good"));
		ratings.add(new Rating(10,5,5,5,"The Staff was very nice"));
		
	}
	
	
	@Override
	public List<Rating> getAllRatings() {
		
		return ratings;
	}


	@Override
	public List<Rating> getRatingByHid(int hotelId) {
		
		return ratings.stream().filter(r-> r.getHid() == hotelId).collect(Collectors.toList());
	
	}

}
