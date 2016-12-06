package com.dota.gg.user.service;


import java.util.List;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dota.gg.user.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-context.xml"})
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	@Test
	public void testAdd() {
		User user = new User();
		user.setName("小小");
		user.setPassword("tiny");
		user.setAge(10);
		user.setBirthday(new Date());
		user.setEmail("1@1.com");
		user.setPhone("13333333333");
		Assert.assertEquals(userService.add(user), 1);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(1L);
		user.setName("山岭");
		user.setPassword("tiny");
		Assert.assertEquals(userService.update(user), 1);
	}

	@Test
	public void testDelete() {
		List<User> users = userService.getAll();
		if(users.size()>0){
			Assert.assertEquals(
					userService.delete(users.get(users.size()-1).getId()), 1);
		}
	}

	@Test
	public void testGetAll() {
		userService.getAll();
	}

}
