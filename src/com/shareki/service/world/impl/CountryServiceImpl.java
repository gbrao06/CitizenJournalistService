package com.shareki.service.world.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.Country;
import com.shareki.model.world.hybernate.dao.intf.ICountryDAO;
import com.shareki.service.world.intf.ICountryService;

@Service
public class CountryServiceImpl implements ICountryService {

	@Autowired
    private ICountryDAO countrydao;

	
	@Override
	public List<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return countrydao.getAllCountries();
		
	}

	@Override
	public Country getCountryByName(String countryName) {
		// TODO Auto-generated method stub
		return countrydao.getCountryByName(countryName);
	}

}
