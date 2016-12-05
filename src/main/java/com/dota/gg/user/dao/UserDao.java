package com.dota.gg.user.dao;

import java.util.List;
import org.mybatis.spring.annotation.MapperScan;
import com.dota.gg.user.entity.User;

@MapperScan
public interface UserDao {
	public int add(User user);
	public int update(User user);
	public int delete(Long id);
	public List<User> getAll();
}
