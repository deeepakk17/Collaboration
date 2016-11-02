/*package pro.niit.collaboration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pro.niit.collaboration.dao.UserDAO;
import pro.niit.collaboration.model.UserAng;
import pro.niit.collaboration.model.UserDetails;
import pro.niit.collaboration.service.UserService;

@RestController
public class TestController {
	
	
	@Autowired
    UserDetails userDetails;
	
	@Autowired
    UserService userService;  //Service which will do all data retrieval/manipulation work

	
	@Autowired
    UserDAO userDAO;
	
	//-------------------Retrieve All Users----------------------------------------------------//
    
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<UserDetails>> listAllUsers() {
    	//List<User> users = userService.findAllUsers();
       List<UserDetails> users = userService.getAllUser();
        if(users.isEmpty()){
            return new ResponseEntity<List<UserDetails>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<UserDetails>>(users, HttpStatus.OK);
    }
  
  
     
    //-------------------Retrieve Single User--------------------------------------------------//
      
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDetails> getUser(@PathVariable("id") String id) {
        System.out.println("Fetching User with id " + id);
        UserDetails user = userService.getUserByUsername(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDetails>(user, HttpStatus.OK);
    }
  
      
      
    //-------------------Create a User----------------------------------------------------------//
      
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody UserDetails user,    UriComponentsBuilder ucBuilder) {
      //  System.out.println("Creating User " + user.getEmailid());
    	
    	System.out.println("Creating User " + user.getUsername());
  
        if (userService.isUserExist(user)) {
            System.out.println("A User with name " + user.getUsername() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
  
       // userService.saveUser(user);
      //  user.setEmailid("abc@gmail.com");
        System.out.println("Creating.. " + user);
        userService.saveOrUpdate(user);
  
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getEmailid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
  
     
      
    //------------------- Update a User --------------------------------------------------------//
      
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserAng> updateUser(@PathVariable("id") long id, @RequestBody UserAng user) {
        System.out.println("Updating User " + id);
          
        UserAng currentUser = userService.findById(id);
          
        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<UserAng>(HttpStatus.NOT_FOUND);
        }
  
        currentUser.setUsername(user.getUsername());
        currentUser.setAddress(user.getAddress());
        currentUser.setEmail(user.getEmail());
          
        userService.updateUser(currentUser);
        return new ResponseEntity<UserAng>(currentUser, HttpStatus.OK);
    }
  
     
     
    //------------------- Delete a User --------------------------------------------------------//
      
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserAng> deleteUser(@PathVariable("id") Long id) {
        System.out.println("Fetching & Deleting User with id " + id);
  
        User user = userService.getUserByEmail(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
  
        userService.deleteUser(id);
        userDAO.deleteus(id);
        return new ResponseEntity<UserAng>(HttpStatus.NO_CONTENT);
    }
  
      
     
    //------------------- Delete All Users ------------------------------------------------------//
      
    @RequestMapping(value = "/user/", method = RequestMethod.DELETE)
    public ResponseEntity<UserAng> deleteAllUsers() {
        System.out.println("Deleting All Users");
  
        userService.deleteAllUsers();
        return new ResponseEntity<UserAng>(HttpStatus.NO_CONTENT);
    }
    
    
  //-------------------Login a User----------------------------------------------------------//
    
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<UserDetails> loginUser(@RequestBody UserDetails user) {
    
  
        if (userService.isUserExist(user)) {
            System.out.println("A User with name " + user.getUsername() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
  
       // userService.saveUser(user);
    	
    	 System.out.println("Getting user.. " + user);
    	
    	UserDetails userDetails = userService.getUserByEmail(user.getEmailid());
        if (userDetails == null) {
            System.out.println("User with id " + user.getEmailid() + " not found");
            return new ResponseEntity<UserDetails>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
       
       
        
  
    }
  
}

*/