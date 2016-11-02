package pro.niit.collaboration.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pro.niit.collaboration.model.UserAng;
import pro.niit.collaboration.model.UserDetails;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	public SessionFactory sessionFactory;

	@Autowired
	public UserAng User;
	
	@Autowired
	public UserDetails userDetails;

	public UserDAOImpl(SessionFactory sessionFactory) {
		try {
			this.sessionFactory = sessionFactory;
		} catch (Exception e) {
			// log.error("Unable to connect with database")
			e.printStackTrace();
		}
	}

	@Transactional
	public void saveOrUpdate(UserDetails userDetails) {
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
		} catch (Exception e) {
			// log.error("Unable to connect with database")
			e.printStackTrace();
		}

	}

	@Transactional
	public void deleteUser(String id) {
		try {
			sessionFactory.getCurrentSession().delete(id);
		} catch (Exception e) {
			// log.error("Unable to delete registered user from database")
			e.printStackTrace();
		}

	}

	@Transactional
	public UserAng getUser(String id) {
		try {
			User = (UserAng) sessionFactory.getCurrentSession().get(UserAng.class, id);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return User;
	}

	@Transactional
	public List<UserDetails> getAllUser() {
		@SuppressWarnings("unchecked")
		List<UserDetails> userList = sessionFactory.getCurrentSession().createCriteria(UserDetails.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return userList;
	}

	@Transactional
	public UserDetails getUserByEmail(String emailid) {
		String hql="FROM UserDetails WHERE emailid = " + "'" + emailid + "'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> listUser = query.list();
		if(listUser!= null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}
	
	@Transactional
	public UserDetails getUserByUsername(String username) {
		String hql="FROM UserDetails WHERE username = " + "'" + username + "'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<UserDetails> listUser = query.list();
		if(listUser!= null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}

	@Transactional
	public void deleteus(Long id) {
		sessionFactory.getCurrentSession().delete(id);
		}
/*
	@Transactional
	public User findByEmail(String emailid) {
		String hql="FROM User WHERE email = " + "'" + emailid + "'";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> listUser = query.list();
		if(listUser!= null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		
		return null;
	}

	@Transactional
	public User findByUsernameCaseInsensitive(String lowercaseLogin) {
		// TODO Auto-generated method stub
		return null;
	}
*/

	
	
}
