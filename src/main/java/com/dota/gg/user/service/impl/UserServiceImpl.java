package com.dota.gg.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dota.gg.user.dao.UserDao;
import com.dota.gg.user.entity.User;
import com.dota.gg.user.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public int add(User user) {
		return userDao.add(user);
	}

	@Override
	public int update(User user) {
		return userDao.update(user);
	}

	@Override
	public int delete(Long id) {
		return userDao.delete(id);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
