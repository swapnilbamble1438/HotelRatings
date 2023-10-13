package com.HotelService.entities;


import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hotel {

	private int hid;
	private String name;
	private String location;
	private String about;
	private String image;
	


	private List<Rating> ratings;
	
	
	public Hotel(int hid, String name, String location, String about,String image) {
		this.hid = hid;
		this.name = name;
		this.location = location;
		this.about = about;
		this.image = image;
	}


}
