package com.shareki.service.world.intf;

import java.util.List;

import com.shareki.model.hybernate.entities.Country;

public interface ICountryService {
	
    public List<Country> getAllCountries();
    public Country getCountryByName(String countryName);
    
}
