package com.userservice.entities;


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
public class User {
	

	private int uid;
	
	private String name;
	
	private String email;
	
	private String about;
	
	
}
