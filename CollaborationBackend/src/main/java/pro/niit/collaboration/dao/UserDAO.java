package pro.niit.collaboration.dao;


import java.util.List;

import pro.niit.collaboration.model.UserAng;
import pro.niit.collaboration.model.UserDetails;

public interface UserDAO {

	
	public void saveOrUpdate(UserDetails userDetails);
	public void deleteUser(String id);
	public UserAng getUser(String id);
	public List<UserDetails> getAllUser();
	public UserDetails getUserByEmail(String emailid);
	public UserDetails getUserByUsername(String username);
	public void deleteus(Long id);
	//public User findByEmail(String lowercaseLogin);
	//public User findByUsernameCaseInsensitive(String lowercaseLogin);
}
