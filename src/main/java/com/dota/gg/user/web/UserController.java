package com.dota.gg.user.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dota.gg.user.entity.User;
import com.dota.gg.user.service.UserService;

//@Controller标示UserController是控制器 Spring会扫描到并注册到spring容器
@Controller
//请求url
@RequestMapping(value = "/user")
public class UserController {
	
	//之前这样写： userService = new UserServiceImpl()
	//有了@Autowired spring会从标注了@Service类来实例化UserService
	@Autowired
	UserService userService;
	
	//请求是/user/list就被spring转到这里来处理了
	@RequestMapping(value = "/list")
	public String getUserList(Model model, HttpServletRequest request){
		List<User> users = userService.getAll();
		//model可以理解为map对象，spring帮我们构建好，作为参数传递过来
		//添加了key：userList value:users,我们可以在jsp中使用userList 它就是users
		model.addAttribute("userlist", users);
		
		if(users.size() > 0){
			//其实model的addAttribute和request.setAttribute的效果一样的 前者是springmvc 后者是Servlet
			request.setAttribute("user", users.get(0));
		}
		//再添加个标题吧
		model.addAttribute("title", "用户列表");
		//返回字符串？ 看看spring-mvc.xml里的视图解析器 会加上前缀和后缀:/WEB-INF/pages/user/list.jsp
		return "user/list"; 
	}
	

}
