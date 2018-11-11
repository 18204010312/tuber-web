package com.banyan.tube.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banyan.tube.entity.Comment;
import com.banyan.tube.entity.User;
import com.banyan.tube.entity.Video;
import com.banyan.tube.form.CommentForm;
import com.banyan.tube.form.VideoForm;
import com.banyan.tube.mapper.CommentMapper;
import com.banyan.tube.mapper.UserMapper;
import com.banyan.tube.mapper.VideoMapper;
import com.banyan.tube.service.VideoService;

@Service
public class VideoServiceImp implements VideoService {
	
	@Autowired
	private VideoMapper videoMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private CommentMapper commentMapper;
	
	@Override
	public List<VideoForm> selectAll(Integer userId){
//		List<Video> videos = videoMapper.selectAll(userId);
		VideoForm form = new VideoForm();
		List<String> sortKey = new ArrayList();
		sortKey.add("create_time");
//		sortKey.add("tags");
//		form.setSortKey(sortKey);
//		List<String> searchKey = new ArrayList();
//		searchKey.add("测");
//		searchKey.add("试");
//		form.setSearchKey(searchKey);
//		form.setSortKey("create_time");
		List<Video> videos = videoMapper.search(form);
		List<VideoForm> videoForms = new ArrayList<>();
		for (Video video : videos) {
			VideoForm videoForm = new VideoForm();
			videoForm.setVideo(video);
			User user = userMapper.selectByPrimaryKey(video.getOwner());
			videoForm.setUser(user);
			videoForms.add(videoForm);
		}
		return videoForms;
	}
	
	@Override
	public List<VideoForm> search(VideoForm form){
		List<Video> videos = videoMapper.search(form);
		List<VideoForm> videoForms = new ArrayList<>();
		for (Video video : videos) {
			VideoForm videoForm = new VideoForm();
			videoForm.setVideo(video);
			User user = userMapper.selectByPrimaryKey(video.getOwner());
			videoForm.setUser(user);
			videoForms.add(videoForm);
		}
		return videoForms;
	}
	@Override
	public VideoForm view(Integer id){
	VideoForm videoF = new VideoForm();
	Video video = videoMapper.selectByPrimaryKey(id);
	videoF.setVideo(video);
	List<Comment> comments = commentMapper.selectByVideoId(id);

	List<CommentForm> commentFs = new ArrayList<>();
	videoF.setComments(commentFs);
	for (Comment comment : comments) {
		CommentForm form = new CommentForm();
		form.setComment(comment);
		User user = userMapper.selectByPrimaryKey(comment.getOwner());
		form.setUser(user);
		commentFs.add(form);
	}
	return videoF;
	}
}
