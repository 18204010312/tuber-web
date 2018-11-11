package com.banyan.tube.form;

import java.util.List;

import com.banyan.tube.entity.Comment;
import com.banyan.tube.entity.User;
import com.banyan.tube.entity.Video;

public class VideoForm {
	
	private Video video;
	
	private User user;
	
	List<CommentForm> comments;
	
	public List<CommentForm> getComments() {
		return comments;
	}

	public void setComments(List<CommentForm> comments) {
		this.comments = comments;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
