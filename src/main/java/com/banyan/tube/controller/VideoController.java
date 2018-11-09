package com.banyan.tube.controller;

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

import com.banyan.tube.entity.TubeVideo;
import com.banyan.tube.mapper.TubeVideoMapper;

@RestController
@RequestMapping("/video")
public class VideoController {

	private final static Logger logger = LoggerFactory.getLogger(VideoController.class);

	
	@Autowired
	private TubeVideoMapper videoMapper;

	@GetMapping
	public ModelAndView list() {
		List<TubeVideo> users = videoMapper.getAll();
		logger.info("test log: UserController-list");
		return new ModelAndView("video/index", "users", users);
	}

	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Integer id) {
		TubeVideo videoR = videoMapper.selectByPrimaryKey(id);
		return new ModelAndView("users/view", "user", videoR);
	}

	@GetMapping(params = "form")
	public String createForm(@ModelAttribute TubeVideo user) {
		return "users/form";
	}

	@PostMapping
	public ModelAndView create(@Valid TubeVideo user, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("users/form", "formErrors", result.getAllErrors());
		}
		this.videoMapper.insert(user);
		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
		return new ModelAndView("redirect:/{user.id}", "user.id", user.getId());
	}

	// @RequestMapping("/add")
	// public void save(TubeVideo user) {
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
	public ModelAndView modifyForm(@PathVariable("id") TubeVideo user) {
		videoMapper.updateByPrimaryKey(user);
		return list();
	}

}
