package com.ty.springbootnativequery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ty.springbootnativequery.dto.Country;

import jakarta.transaction.Transactional;

public interface CountryRepository extends JpaRepository<Country,Integer> {
	
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "insert into country(countryCode,countryCapital,countryName,countryState)"
	+"values(:#{#country.countryCode},:#{#country.countryCapital},:#{#country.countryName},:#{#country.countryState})",nativeQuery = true)
	public void saveMyCountry(@Param("country") Country country);
	
	@Query(value = "Select * from country", nativeQuery = true)
	public List<Country> getAllCountry();
	
	//deleteMyCountry
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value = "delete from country where countrycode=?1",nativeQuery = true)
	public void deleteMyCountry(int id);
	
	//updateMyCountry
	@Modifying(clearAutomatically = true)
	@Transactional
	@Query(value ="update country set countryname=?1,countrycapital=?2 where countrycode=?3",nativeQuery = true )
	public void updateCountry(String countryName,String countryCapital,int countryCode);
	

}
