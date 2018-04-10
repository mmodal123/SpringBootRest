package com.mmodal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@Autowired
	AlienRepository repo;
	
	@CrossOrigin(maxAge = 3600)
	@GetMapping("aliens")
	public List<Alien> getAliens(){
		
		List<Alien> aliens=(List<Alien>) repo.findAll();
		return aliens;
	}

}
