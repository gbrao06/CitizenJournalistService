package com.shareki.service.world.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.City;
import com.shareki.model.world.hybernate.dao.intf.ICityDAO;
import com.shareki.service.world.intf.ICityService;

@Service
public class CityServiceImpl implements ICityService{

	@Autowired
    private ICityDAO citydao;

	@Override
	public List<City> getAllCitiesInState(String stateName, String countryName) {
		// TODO Auto-generated method stub

		return citydao.getAllCitiesInState(stateName,countryName);
	}

	@Override
	public List<City> getAllCitiesInCountry(String countryName) {
		// TODO Auto-generated method stub
		return citydao.getAllCitiesInCountry(countryName);
	}

	@Override
	public City getCityByName(String cityName, String countryName) {
		// TODO Auto-generated method stub
		return citydao.getCityByName(cityName,countryName);
	}
	
}
