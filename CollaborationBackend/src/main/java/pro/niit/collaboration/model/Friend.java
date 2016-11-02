package pro.niit.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Friend {

	@Id
	@GeneratedValue
	private String id;
	private String emailid;
	private String friendemailid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFriendemailid() {
		return friendemailid;
	}
	public void setFriendemailid(String friendemailid) {
		this.friendemailid = friendemailid;
	}
	
	

}
