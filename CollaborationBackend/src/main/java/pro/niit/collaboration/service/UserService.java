package pro.niit.collaboration.service;

import java.util.List;

import pro.niit.collaboration.model.UserAng;
import pro.niit.collaboration.model.UserDetails;

public interface UserService {

	UserAng findById(long id);
    
    UserAng findByName(String name);
     
    void saveUser(UserAng user);
     
    void updateUser(UserAng user);
     
    void deleteUserById(long id);
 
    List<UserAng> findAllUsers(); 
     
    void deleteAllUsers();
     
    public boolean isUserExist(UserAng user);
    
    
    
    //-----------------------------------------------------------------------------------
   
    
    public List<UserDetails> getAllUser();
    public void saveOrUpdate(UserDetails UserAng);
    public UserDetails getUserByEmail(String emailid);
    public UserDetails getUserByUsername(String username);
    public void deleteUser(String id);
}
