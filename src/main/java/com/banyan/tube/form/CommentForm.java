package com.banyan.tube.form;

import com.banyan.tube.entity.Comment;
import com.banyan.tube.entity.User;

public class CommentForm {
	
	Comment comment;

	User user;
	
	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
