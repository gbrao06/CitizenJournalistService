package com.shareki.service.world.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.Sharekinews;
import com.shareki.model.world.hybernate.dao.intf.ISharekiNewsDAO;
import com.shareki.service.world.intf.ISharekiNewsService;

@Service
public class SharekiNewsServiceImpl implements ISharekiNewsService {

	@Autowired
	private ISharekiNewsDAO newsdao;
	
	
	@Override
	public List<Sharekinews> getAllNewsInCity(String cityName, String countryName) {
		// TODO Auto-generated method stub
		return newsdao.getAllNewsInCity(cityName,countryName);
	}

	@Override
	public List<Sharekinews> getAllNewsInNeighbour(String villageName,
			String cityName, String countryName) {
		// TODO Auto-generated method stub
		return newsdao.getAllNewsInNeighbour(villageName,cityName,countryName);
	}

	@Override
	public List<Sharekinews> getAllNewsOfUser(String userId) {
		// TODO Auto-generated method stub
		return newsdao.getAllNewsOfUser(userId);
	}

	@Override
	public List<Sharekinews> getAllEmergencyInNeighbour(String villageName,
			String cityName, String countryName) {
		// TODO Auto-generated method stub
		return newsdao.getAllEmergencyInNeighbour(villageName,cityName,countryName);
	}

	@Override
	public List<Sharekinews> getAllEmergencyInCity(String cityName,
			String countryName) {
		// TODO Auto-generated method stub
		return newsdao.getAllEmergencyInCity(cityName,countryName);
	}

	@Override
	public List<Sharekinews> getAllEmergencyInCountry(String countryName) {
		// TODO Auto-generated method stub
		return newsdao.getAllEmergencyInCountry(countryName);
	}
	
}
