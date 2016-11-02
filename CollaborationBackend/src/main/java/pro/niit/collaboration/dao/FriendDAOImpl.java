package pro.niit.collaboration.dao;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pro.niit.collaboration.model.Friend;

@Repository
public class FriendDAOImpl implements FriendDAO{

	@Autowired
	public SessionFactory sessionFactory;
	
	@Transactional
	public void saveOrUpdate(Friend friends) {
		sessionFactory.getCurrentSession().saveOrUpdate(friends);
	}

}
