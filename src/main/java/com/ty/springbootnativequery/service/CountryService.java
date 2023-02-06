package com.ty.springbootnativequery.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.springbootnativequery.dao.CountryDao;
import com.ty.springbootnativequery.dto.Country;

@Service
public class CountryService {
	
	@Autowired
	CountryDao dao;
	
	   //insert the methods
	public Country saveMyCountry(Country country) {
		dao.saveMyCountry(country);
		return country;
	}
	
	public List<Country> getAllCountry()
	{  
		return dao.getAllCountry();
	}
	
	public String deleteMyCountry(int id) {
		dao.deleteMyCountry(id);
		return "Data deleted";
	}
	
	//updateCountry
		public String updateCountry(String countryName,String countryCapital,int countryCode) {
			dao.updateCountry(countryName, countryCapital, countryCode);
			return "update country";
		}

}
