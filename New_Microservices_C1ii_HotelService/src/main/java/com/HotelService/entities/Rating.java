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
public class Rating {

	private int rid;
	private int uid;
	private int hid;
	private int rating;
	private String feedback;
	
	private List<User> users;

	public Rating(int rid, int uid, int hid, int rating, String feedback) {
		super();
		this.rid = rid;
		this.uid = uid;
		this.hid = hid;
		this.rating = rating;
		this.feedback = feedback;
	}

	
	
	
	
	
	

}
