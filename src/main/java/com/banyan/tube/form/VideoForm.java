package com.banyan.tube.form;

import java.util.List;

import com.banyan.tube.entity.Comment;
import com.banyan.tube.entity.User;
import com.banyan.tube.entity.Video;

public class VideoForm {
	
	private Video video;
	
	private User user;
	
	List<CommentForm> comments;
	
	//查询条件
	
	private List<String> searchKey;
	
	//都好分割
	private List<String> chooseTags;
	
	//排序
	private List<String> sortKey;
	
	private Integer userId;
	
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public List<String> getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(List<String> searchKey) {
		this.searchKey = searchKey;
	}

	public List<String> getChooseTags() {
		return chooseTags;
	}

	public void setChooseTags(List<String> chooseTags) {
		this.chooseTags = chooseTags;
	}

	public List<String> getSortKey() {
		return sortKey;
	}

	public void setSortKey(List<String> sortKey) {
		this.sortKey = sortKey;
	}

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
