package com.presentation;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entities.User;
import com.services.UserService;

@Component
@Scope("session")
public class UserController {
	private User user;

	@Autowired
	UserService service;

	public UserController() {
		super();
	}

	@PostConstruct
	public void init() {
		user = new User();
	}

	public void addUser() {
		service.addUser(user);
		user = new User();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
