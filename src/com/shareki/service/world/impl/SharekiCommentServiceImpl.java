package com.shareki.service.world.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shareki.model.hybernate.entities.Sharekicomment;
import com.shareki.model.hybernate.entities.Sharekinews;
import com.shareki.model.world.hybernate.dao.intf.ISharekiNewsCommentDAO;

import com.shareki.service.world.intf.ISharekiNewsCommentService;

//dirtyflag can be removerequest,like,hotnews
@Service
public class SharekiCommentServiceImpl implements ISharekiNewsCommentService {

	@Autowired
	private ISharekiNewsCommentDAO sharekicommentdao;
	
	
	@Override
	public List<Sharekicomment> getAllComments(String newsPK) {
		// TODO Auto-generated method stub
		return sharekicommentdao.getAllComments(newsPK); 
	}

	@Override
	public List<Sharekinews> getAllNewsByDirtyFlag(byte dirtyFlag) {
		// TODO Auto-generated method stub
		return sharekicommentdao.getAllNewsByDirtyFlag(dirtyFlag); 
	}

	@Override
	public List<Sharekicomment> getAllCommentsByDirtyFlag(byte flag) {
		// TODO Auto-generated method stub

		return sharekicommentdao.getAllCommentsByDirtyFlag(flag);
	}

	@Override
	public Sharekicomment addSharekiComment(String comment, String newsPK,
			String userPK, byte dirtyflag) {
		// TODO Auto-generated method stub
		return sharekicommentdao.addSharekiComment(comment,newsPK,userPK,dirtyflag);		
		
	}
		
}
