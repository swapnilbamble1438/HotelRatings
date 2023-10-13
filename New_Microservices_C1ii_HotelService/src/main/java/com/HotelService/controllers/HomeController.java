package com.HotelService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.HotelService.entities.Hotel;
import com.HotelService.services.HotelService;

@Controller
@RequestMapping("/hotel")
public class HomeController {
	
	@Autowired
	private HotelService hotServ;
	
	
	@GetMapping("/home")
	public String index(Model m)
	{
		List<Hotel> hotels = hotServ.getAll();
		m.addAttribute("hotels",hotels);
		return "viewhotels";
	}

}
