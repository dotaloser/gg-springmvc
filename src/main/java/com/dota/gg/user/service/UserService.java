package com.dota.gg.user.service;

import java.util.List;

import com.dota.gg.user.entity.User;

public interface UserService {
	public int add(User user);
	public int update(User user);
	public int delete(Long id);
	public List<User> getAll();
}
