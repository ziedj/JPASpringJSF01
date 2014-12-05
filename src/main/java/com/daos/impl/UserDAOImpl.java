package com.daos.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.daos.UserDAO;
import com.entities.User;

@Component
@Transactional
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public void addUser(User user) {
		User tmp = em.merge(user);
		System.out.println(tmp);
	}

	@Override
	public void deleteUser(Long user_id) {
		User user = this.findUserById(user_id);
		em.remove(user);
	}

	@Override
	public User findUserById(Long user_id) {
		return em.find(User.class, user_id);
	}

	@Override
	public List<User> getAllUsers() {
		return null;
	}

}
