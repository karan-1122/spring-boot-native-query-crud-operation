package com.ty.springbootnativequery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.springbootnativequery.dto.Country;
import com.ty.springbootnativequery.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService service;
	
	@PostMapping("/saveMyCountry")
	  //insert the methods
		public Country saveMyCountry(@RequestBody Country country) {
			return service.saveMyCountry(country);
		}
	
	@GetMapping("/displayMyCountry")
	//displayMethod
	public List<Country> getAllCountry()
	{
		return service.getAllCountry();
	}
	
	@DeleteMapping("/deleteMyCountry/{id}")
	//deleteMyCountry
	public String deleteMyCountry(@PathVariable int id) {
		service.deleteMyCountry(id);
		return "Data deleted";
	}
	
			@PutMapping("/updateMyCountry/{countryName}/{countryCapital}/{countryCode}")
	      //updateCountry
			public String updateCountry(@PathVariable String countryName,@PathVariable String countryCapital,@PathVariable int countryCode) {
				return service.updateCountry(countryName, countryCapital, countryCode);
				
			}
	
}
