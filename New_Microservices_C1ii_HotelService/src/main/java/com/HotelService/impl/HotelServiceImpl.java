package com.HotelService.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HotelService.entities.Hotel;
import com.HotelService.entities.Rating;
import com.HotelService.entities.User;
import com.HotelService.exceptions.ResourceNotFoundException;
import com.HotelService.feignclients.RatingClient;
import com.HotelService.feignclients.UserClient;
import com.HotelService.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

	
	private static List<Hotel> hotels = new ArrayList<>();
	
	static {
		hotels.add(new Hotel(1,"Gem Villa","Nashik","Best Hotel","gemvilla.jpg"));
		hotels.add(new Hotel(2,"Hotel Florence","Mumbai","Best Hotel","hotelflorence.jpg"));
		hotels.add(new Hotel(3,"Hotel Royal","Pune","Best Hotel","hotelroyal.jpg"));
		hotels.add(new Hotel(4,"Parivar Suite","Thane","Best Hotel","parivarsuite.jpg"));
		hotels.add(new Hotel(5,"Flora Residence","Goa","Best Hotel","floraresidence.jpg"));
		
		
		
	}
	
	@Autowired
	private RatingClient ratingClient;
	
	@Autowired
	private UserClient userClient;


	public List<Hotel> getAll() {
		
		
		List<Rating> allRatings = ratingClient.getAllRatings().getBody();
		
		List<User> allUsers = userClient.getAllUser().getBody();
		
	
		hotels.forEach(hotel ->{
			
		List<Rating> ratings = allRatings.stream().filter(r-> r.getHid() == hotel.getHid()).collect(Collectors.toList());
			
			ratings.forEach(rating ->{
				
				List<User> users = allUsers.stream().filter(u->u.getUid() == rating.getUid()).collect(Collectors.toList());
				
				rating.setUsers(users);
			});
			
		hotel.setRatings(ratings);	
		
		});
		
		return hotels;
	}

	
	public Hotel get(int id) {
		
		
	Hotel hotel=	hotels.stream().filter(e-> e.getHid()== id).findFirst()
				.orElseThrow(()
						-> new ResourceNotFoundException(
								"Hotel with given id: "+id+" is not found on server !!"
								));
		
	
	List<Rating> ratings = ratingClient.getRatingByHid(id).getBody();
	
	List<User> allUsers = userClient.getAllUser().getBody();

	ratings.forEach(rating ->{
		
		List<User> users = allUsers.stream().filter(u->u.getUid() == rating.getUid()).collect(Collectors.toList());
		
		rating.setUsers(users);
	});
	
	
	hotel.setRatings(ratings);
	
				return hotel;
	}

}
