package com.daos;

import java.util.List;

import com.entities.User;

public interface UserDAO {
	// Add User
	void addUser(User user);

	void deleteUser(Long user_id);

	User findUserById(Long user_id);

	List<User> getAllUsers();
}
