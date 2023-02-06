package com.ty.springbootnativequery.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springbootnativequery.dto.Country;
import com.ty.springbootnativequery.repository.CountryRepository;

@Repository
public class CountryDao {
	
	@Autowired
	CountryRepository countryRepository;
	
	public void saveMyCountry(Country country) {
		countryRepository.saveMyCountry(country);
	}
	
	public List<Country> getAllCountry(){
		 return countryRepository.getAllCountry();
		
	}
	
	public void deleteMyCountry(int id) {
		countryRepository.deleteMyCountry(id);
	}

	//updateCountry
	public void updateCountry(String countryName,String countryCapital,int countryCode) {
		countryRepository.updateCountry(countryName, countryCapital, countryCode);
	}
}
