package com.example.coding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.coding.services.PharmaciesServices;

@RestController
public class PharmaciesController {
	
	@Autowired
	private PharmaciesServices pharmaciesservice;
	
	@CrossOrigin("*")
	@GetMapping("/getPharmacies/{latitude}/{longitude}")
	public @ResponseBody ResponseEntity<?> getPharmacies(@PathVariable("latitude") double latitude,@PathVariable("longitude") double longitude)
	{
	    return ResponseEntity.ok(this.pharmaciesservice.getPharmacies(latitude,longitude));
	}


}
