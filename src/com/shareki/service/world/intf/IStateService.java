package com.shareki.service.world.intf;

import java.util.List;

import com.shareki.model.hybernate.entities.State;

public interface IStateService {
	
    public List<State> getAllStatesInCountry(String countryName);
    public State getStateByName(String stateName,String countryName);
}
