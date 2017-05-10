package com.shareki.service.world.intf;

import java.util.List;

import com.shareki.model.hybernate.entities.Sharekicomment;
import com.shareki.model.hybernate.entities.Sharekinews;

//dirty flags, like,dirty
public interface ISharekiNewsCommentService {
	
    public List<Sharekicomment> getAllComments(String newsPK);
    public List<Sharekinews> getAllNewsByDirtyFlag(byte flag);
    public List<Sharekicomment> getAllCommentsByDirtyFlag(byte flag);
    
    public Sharekicomment addSharekiComment(String comment,String newsPK,String userPK,byte dirtyflag);
    //for unwanted image sharing, make it as dirty
    
}
