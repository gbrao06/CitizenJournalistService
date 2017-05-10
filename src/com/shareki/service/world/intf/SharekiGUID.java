package com.shareki.service.world.intf;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;


public class SharekiGUID {
	
	public static final UUID getUUID()
	{
		
		return UUID.randomUUID();
	}
	
	public static final BigInteger getGUID()
	{
		Timestamp tp=new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		long ll=tp.getTime();
		return BigInteger.valueOf(ll);
		//return UUID.randomUUID();
	}
	

}
