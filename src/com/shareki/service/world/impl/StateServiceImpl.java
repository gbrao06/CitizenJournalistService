package com.shareki.service.world.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.State;
import com.shareki.model.world.hybernate.dao.intf.IStateDAO;
import com.shareki.service.world.intf.IStateService;

@Service
public class StateServiceImpl implements IStateService {

	@Autowired
    private IStateDAO statedao;

	@Override
	public List<State> getAllStatesInCountry(String countryName) {
		// TODO Auto-generated method stub
		return statedao.getAllStatesInCountry(countryName);
	}

	@Override
	public State getStateByName(String stateName, String countryName) {
		// TODO Auto-generated method stub
		return statedao.getStateByName(stateName,countryName);
	}

}
