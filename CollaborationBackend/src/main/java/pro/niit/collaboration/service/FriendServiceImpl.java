package pro.niit.collaboration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.niit.collaboration.dao.FriendDAO;
import pro.niit.collaboration.model.Friend;

@Service
public class FriendServiceImpl implements FriendService {

	@Autowired
	private FriendDAO friendDAO;
	
	@Override
	public void saveOrUpdate(Friend friends) {
		friendDAO.saveOrUpdate(friends);
		
	}

	
}
