package pro.niit.collaboration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Forum {

	@Id
	private String forumid;
	private String forumname;
	private String posteddate;
	private String postedtime;
	private String forumapproved;
	private String post;
	private String commentid;
	private String rating;
	public String getForumid() {
		return forumid;
	}
	public void setForumid(String forumid) {
		this.forumid = forumid;
	}
	public String getForumname() {
		return forumname;
	}
	public void setForumname(String forumname) {
		this.forumname = forumname;
	}
	public String getPosteddate() {
		return posteddate;
	}
	public void setPosteddate(String posteddate) {
		this.posteddate = posteddate;
	}
	public String getPostedtime() {
		return postedtime;
	}
	public void setPostedtime(String postedtime) {
		this.postedtime = postedtime;
	}
	public String getForumapproved() {
		return forumapproved;
	}
	public void setForumapproved(String forumapproved) {
		this.forumapproved = forumapproved;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCommentid() {
		return commentid;
	}
	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	

}
