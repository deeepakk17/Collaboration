package pro.niit.collaboration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import pro.niit.collaboration.model.Friend;
import pro.niit.collaboration.service.FriendService;

@RestController
public class FriendController {

	@Autowired
    private Friend friends;
	
	@Autowired
    FriendService friendService;  //Service which will do all data retrieval/manipulation work

	
		
	/*============================================ Add new Friends ============================================*/
    
    @RequestMapping(value = "/friend/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Friend friends,UriComponentsBuilder ucBuilder) {
    	
    	System.out.println("Making Friends " + friends.getEmailid()+friends.getFriendemailid());
        friendService.saveOrUpdate(friends);
  
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/friend/{id}").buildAndExpand(friends.getEmailid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
