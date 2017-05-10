package com.shareki.service.world.intf;

import java.util.List;

import com.shareki.model.hybernate.entities.City;

public interface ICityService {
	
    public List<City> getAllCitiesInState(String stateName,String countryName);
    public List<City> getAllCitiesInCountry(String countryName);
    public City getCityByName(String cityName,String countryName);
    
}
