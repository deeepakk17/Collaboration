package pro.niit.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

	@Id
	private String messageid;
	private String fromemailid;
	private String toemailid;
	private String date;
	private String time;
	private String message;
	public String getMessageid() {
		return messageid;
	}
	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}
	public String getFromemailid() {
		return fromemailid;
	}
	public void setFromemailid(String fromemailid) {
		this.fromemailid = fromemailid;
	}
	public String getToemailid() {
		return toemailid;
	}
	public void setToemailid(String toemailid) {
		this.toemailid = toemailid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
