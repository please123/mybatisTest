package com.example.demo.cotroller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;
import com.example.demo.domain.User;

@RestController
@MapperScan(basePackages = "com.example.demo.dao")
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping ("/users")
	public List<User> user(@RequestParam(value="country",defaultValue = " ") String country) throws Exception {
		final User param = new User(0, null, country);
		final List<User> userList = userDAO.selectUsers(param);
		return userList;
	}


}
