package com.services;

import java.util.List;

import com.entities.User;

public interface UserService {
	void addUser(User user);

	void deleteUser(Long user_id);

	User findUserById(Long user_id);

	List<User> getAllUsers();
}
