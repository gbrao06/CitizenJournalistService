package com.shareki.service.world.intf;

import java.util.List;

import com.shareki.model.hybernate.entities.Cityneighbour;
import com.shareki.model.hybernate.entities.Sharekinews;

public interface ICityNeighbourService {
	
    public List<Cityneighbour> getAllNeighboursOfCity(String cityName,String countryName);
    public Cityneighbour getCityneighbour(String village,String cityName,String countryName);
    public Cityneighbour addCityNeighbour(String villageName,String cityName,String countryName);
    
    public Sharekinews addSharekiNew(String title,String news, byte[] image,String villageName,String nearestCity,String countryName,String userPK);
	public Sharekinews addSharekiEHelp(String title, String news,
			String villageName, String cityName, String countryName,
			String userPK);
    
}
