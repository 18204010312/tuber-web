package com.banyan.tuber.controller;

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

import com.banyan.tuber.entity.UserEntity;
import com.banyan.tuber.mapper.UserMapper;

@RestController
@RequestMapping("/users")
public class UserController {

	private final static Logger logger = LoggerFactory.getLogger(UserController.class);

	
	@Autowired
	private UserMapper userMapper;

	@GetMapping
	public ModelAndView list() {
		List<UserEntity> users = userMapper.getAll();
		logger.info("test log: UserController-list");
		return new ModelAndView("users/list", "users", users);
	}

	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Long id) {
		UserEntity userR = userMapper.getOne(id);
		return new ModelAndView("users/view", "user", userR);
	}

	@GetMapping(params = "form")
	public String createForm(@ModelAttribute UserEntity user) {
		return "users/form";
	}

	@PostMapping
	public ModelAndView create(@Valid UserEntity user, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return new ModelAndView("users/form", "formErrors", result.getAllErrors());
		}
		this.userMapper.insert(user);
		redirect.addFlashAttribute("globalMessage", "Successfully created a new message");
		return new ModelAndView("redirect:/{user.id}", "user.id", user.getId());
	}

	// @RequestMapping("/add")
	// public void save(UserEntity user) {
	// userMapper.insert(user);
	// }

	@RequestMapping("foo")
	public String foo() {
		throw new RuntimeException("Expected exception in controller");
	}

	@GetMapping(value = "delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {
		this.userMapper.delete(id);
		return list();
	}

	@GetMapping(value = "modify/{id}")
	public ModelAndView modifyForm(@PathVariable("id") UserEntity user) {
		userMapper.update(user);
		return list();
	}

}
