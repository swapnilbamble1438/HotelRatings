package com.RatingService.entities;


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
public class Rating {
	
	private int rid;
	private int hid;
	private int uid;
	private int rating;
	private String feedback;

	
	
	
	

}
