package pro.niit.collaboration.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.niit.collaboration.dao.UserDAO;
import pro.niit.collaboration.model.UserAng;
import pro.niit.collaboration.model.UserDetails;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	private static final AtomicLong counter = new AtomicLong();
    
    private static List<UserAng> users;
     
    static{
        users= populateDummyUsers();
    }
 
    public List<UserAng> findAllUsers() {
        return users;
    }
     
    public UserAng findById(long id) {
        for(UserAng user : users){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
     
    public UserAng findByName(String name) {
        for(UserAng user : users){
            if(user.getUsername().equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }
     
    public void saveUser(UserAng user) {
        user.setId(counter.incrementAndGet());
        users.add(user);
    }
 
    public void updateUser(UserAng user) {
        int index = users.indexOf(user);
        users.set(index, user);
    }
 
    public void deleteUserById(long id) {
         
        for (Iterator<UserAng> iterator = users.iterator(); iterator.hasNext(); ) {
            UserAng user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
            }
        }
    }
 
    public boolean isUserExist(UserAng user) {
        return findByName(user.getUsername())!=null;
    }
     
    public void deleteAllUsers(){
        users.clear();
    }
 
    private static List<UserAng> populateDummyUsers(){
        List<UserAng> users = new ArrayList<UserAng>();
        users.add(new UserAng(counter.incrementAndGet(),"Sam", "NY", "sam@abc.com"));
        users.add(new UserAng(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com"));
        users.add(new UserAng(counter.incrementAndGet(),"Kelly", "NEBRASKA", "kelly@abc.com"));
        return users;
    }
    
    
    
//-----------------------------------------------------------------------------------------------------------
    
	public List<UserDetails> getAllUser() {
		return userDAO.getAllUser();
	}
	
	public void saveOrUpdate(UserDetails userDetails) {
		userDAO.saveOrUpdate(userDetails);
    }
	
	public UserDetails getUserByEmail(String emailid) {
        return userDAO.getUserByEmail(emailid);
    }
	
	public UserDetails getUserByUsername(String username) {
        return userDAO.getUserByUsername(username);
    }
     
	
	 public void deleteUser(String id) {
		 userDAO.deleteUser(id);
	    }
}
