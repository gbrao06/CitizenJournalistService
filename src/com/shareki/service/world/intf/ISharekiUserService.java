package com.shareki.service.world.intf;

import java.math.BigInteger;
import java.util.List;

import com.shareki.model.hybernate.entities.Sharekiuser;

public interface ISharekiUserService {
	
    public List<Sharekiuser> getAllSharekiUsers();
    public Sharekiuser addSharekiUser(String firstname,String lastname,String citizenshipPK,String email,String passwd,String phone,String userid);//returns shareki user with pk
    public Sharekiuser getSharekiUserByPK(BigInteger userPK);//returns sharekiuser object
    public Sharekiuser getSharekiUserByUserId(String userId,String passwd);
    
}
