package com.shareki.service.world.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.Sharekiuser;
import com.shareki.model.world.hybernate.dao.intf.ISharekiUserDAO;
import com.shareki.service.world.intf.ISharekiUserService;

@Service
public class SharekiUserServiceImpl implements ISharekiUserService{

	@Autowired
    private ISharekiUserDAO userdao;

	@Override
	public List<Sharekiuser> getAllSharekiUsers() {
		// TODO Auto-generated method stub
		return userdao.getAllSharekiUsers();
		//return null;
	}

	@Override
	public Sharekiuser addSharekiUser(String firstname, String lastname,
			String countryPK, String email, String passwd, String phone,
			String userid) {	
		// TODO Auto-generated method stub
		Sharekiuser user=userdao.addSharekiUser(firstname,lastname,countryPK,email,passwd,phone,userid);
		if(user!=null)
		{
			System.out.println("IN Service: addSharekiUser:USER NOT NULL:UserId:"+user.getUserid());
		}
		else
		{
			System.out.println("IN Service: addSharekiUser:USER = NULL:");
		}
		return user;
	}

	@Override
	public Sharekiuser getSharekiUserByUserId(String userId,String passwd) {
		// TODO Auto-generated method stub
		Sharekiuser user=userdao.getSharekiUserByUserId(userId,passwd);
		if(user!=null)
		{
			System.out.println("IN Service: getSharekiUserByUserId:USER NOT NULL:UserId:"+user.getUserid());
		}
		else
		{
			System.out.println("IN Service: getSharekiUserByUserId:USER = NULL:");
		}
		return user; 
	}

	@Override
	public Sharekiuser getSharekiUserByPK(BigInteger userPK) {
		// TODO Auto-generated method stub
		return userdao.getSharekiUserByPK(userPK);
	}

		
}
