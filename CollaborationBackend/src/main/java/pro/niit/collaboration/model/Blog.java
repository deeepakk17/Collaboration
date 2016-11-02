package pro.niit.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Blog {

	@Id
	private String blogid;
	private String blogname;
	private String creationdate;
	private String creationtime;
	private String status;
	private String adminemailid;
	private String posts;
	private String commentid;
	
	public String getBlogid() {
		return blogid;
	}
	public void setBlogid(String blogid) {
		this.blogid = blogid;
	}
	public String getBlogname() {
		return blogname;
	}
	public void setBlogname(String blogname) {
		this.blogname = blogname;
	}
	public String getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}
	public String getCreationtime() {
		return creationtime;
	}
	public void setCreationtime(String creationtime) {
		this.creationtime = creationtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAdminemailid() {
		return adminemailid;
	}
	public void setAdminemailid(String adminemailid) {
		this.adminemailid = adminemailid;
	}
	public String getPosts() {
		return posts;
	}
	public void setPosts(String posts) {
		this.posts = posts;
	}
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	
	

}
