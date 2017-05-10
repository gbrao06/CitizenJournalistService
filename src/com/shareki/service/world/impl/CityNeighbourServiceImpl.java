package com.shareki.service.world.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.Cityneighbour;
import com.shareki.model.hybernate.entities.Sharekinews;
import com.shareki.model.world.hybernate.dao.intf.ICityNeighbourDAO;
import com.shareki.service.world.intf.ICityNeighbourService;

@Service
public class CityNeighbourServiceImpl implements ICityNeighbourService {

	@Autowired
	ICityNeighbourDAO cityneighbour;
	

	@Override
	public List<Cityneighbour> getAllNeighboursOfCity(String cityName,
			String countryName) {
		//delegate the call to model implementation impl
		return cityneighbour.getAllNeighboursOfCity(cityName, countryName);
	}

	@Override
	public Cityneighbour getCityneighbour(String villageName, String cityName,
			String countryName) {
		// TODO Auto-generated method stub
		return cityneighbour.getCityneighbour(villageName,cityName, countryName);
	}

	@Override
	public Cityneighbour addCityNeighbour(String villageName, String cityName,
			String countryName) {
		// TODO Auto-generated method stub
		return cityneighbour.addCityNeighbour(villageName,cityName,countryName);
	}

	@Override
	public Sharekinews addSharekiNew(String title,String news, byte[] image,
			String villageName, String nearestCity, String countryName,String userPK) {
		// TODO Auto-generated method stub
		return cityneighbour.addSharekiNew(title,news, image,villageName,nearestCity,countryName,userPK);
	}

	@Override
	public Sharekinews addSharekiEHelp(String title, String news,
			String villageName, String cityName, String countryName,
			String userPK) {
		// TODO Auto-generated method stub
		return cityneighbour.addSharekiEHelp(title,news,villageName,cityName,countryName,userPK);
	}

}
