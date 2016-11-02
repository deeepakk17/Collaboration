package pro.niit.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="UserTable")
@Entity
@Component
public class UserAng {

	@Id
	 private long id;
     
	    private String username;
	     
	    private String address;
	     
	    private String email;
	     
	    public UserAng(){
	        id=0;
	    }
	     
	    public UserAng(long id, String username, String address, String email){
	        this.id = id;
	        this.username = username;
	        this.address = address;
	        this.email = email;
	    }
	 
	    public long getId() {
	        return id;
	    }
	 
	    public void setId(long id) {
	        this.id = id;
	    }
	 
	    public String getUsername() {
	        return username;
	    }
	 
	    public void setUsername(String username) {
	        this.username = username;
	    }
	 
	    public String getAddress() {
	        return address;
	    }
	 
	    public void setAddress(String address) {
	        this.address = address;
	    }
	 
	    public String getEmail() {
	        return email;
	    }
	 
	    public void setEmail(String email) {
	        this.email = email;
	    }
	 
	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + (int) (id ^ (id >>> 32));
	        return result;
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (!(obj instanceof UserAng))
	            return false;
	        UserAng other = (UserAng) obj;
	        if (id != other.id)
	            return false;
	        return true;
	    }
	 
	    @Override
	    public String toString() {
	        return "User [id=" + id + ", username=" + username + ", address=" + address
	                + ", email=" + email + "]";
	    }
}