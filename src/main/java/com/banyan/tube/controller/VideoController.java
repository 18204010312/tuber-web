package com.banyan.tube.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.banyan.tube.entity.Comment;
import com.banyan.tube.entity.User;
import com.banyan.tube.entity.Video;
import com.banyan.tube.form.CommentForm;
import com.banyan.tube.form.VideoForm;
import com.banyan.tube.mapper.CommentMapper;
import com.banyan.tube.mapper.UserMapper;
import com.banyan.tube.mapper.VideoMapper;

@RestController
@RequestMapping("/video")
public class VideoController {

	private final static Logger logger = LoggerFactory.getLogger(VideoController.class);

	
	@Autowired
	private VideoMapper videoMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private CommentMapper commentMapper;

	@GetMapping
	public ModelAndView list() {
		List<Video> videos = videoMapper.selectAll(1);
		List<VideoForm> videoForms = new ArrayList<>();
		for(Video video:videos) {
			VideoForm videoForm = new VideoForm();
			videoForm.setVideo(video);
			User user = userMapper.selectByPrimaryKey(video.getOwner());
			videoForm.setUser(user);
			videoForms.add(videoForm);
		}
		
		logger.info("test log: VideoController-list");
		return new ModelAndView("video/index", "videos", videoForms);
	}

	@GetMapping("view/{id}")
	public ModelAndView view(@PathVariable("id") Integer id) {
		VideoForm videoF = new VideoForm();
		Video video = videoMapper.selectByPrimaryKey(id);
		videoF.setVideo(video);
		List<Comment> comments = commentMapper.selectByVideoId(id);
		
		List<CommentForm> commentFs = new ArrayList<>();
		videoF.setComments(commentFs);
		for(Comment comment:comments) {
			CommentForm form = new CommentForm();
			form.setComment(comment);
			User user = userMapper.selectByPrimaryKey(comment.getOwner());
			form.setUser(user);
			commentFs.add(form);
		}
		
		return new ModelAndView("video/view", "video", videoF);
	}

	@GetMapping(params = "form")
	public String createForm(@ModelAttribute Video user) {
		return "videos/form";
	}

	@PostMapping
	public ModelAndView create(@Valid Video user, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("videos/form", "formErrors", result.getAllErrors());
		}
		this.videoMapper.insert(user);
		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
		return new ModelAndView("redirect:/{user.id}", "user.id", user.getId());
	}

	// @RequestMapping("/add")
	// public void save(Video user) {
	// videoMapper.insert(user);
	// }

	@RequestMapping("foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	@GetMapping(value = "delete/{id}")
	public ModelAndView delete(@PathVariable("id") Integer id) {
		this.videoMapper.deleteByPrimaryKey(id);
		return list();
	}

	@GetMapping(value = "modify/{id}")
	public ModelAndView modifyForm(@PathVariable("id") Video user) {
		videoMapper.updateByPrimaryKey(user);
		return list();
	}

}
