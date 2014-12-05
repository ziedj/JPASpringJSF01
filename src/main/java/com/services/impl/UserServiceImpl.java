package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.daos.UserDAO;
import com.entities.User;
import com.services.UserService;

@Component
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;

	@Override
	public void addUser(User user) {
		dao.addUser(user);
	}

	@Override
	public void deleteUser(Long user_id) {
		dao.deleteUser(user_id);
	}

	@Override
	public User findUserById(Long user_id) {
		return dao.findUserById(user_id);
	}

	@Override
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}

}
