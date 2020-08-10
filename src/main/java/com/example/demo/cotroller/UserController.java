package com.example.demo.cotroller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;
import com.example.demo.domain.User;

@RestController
@MapperScan(basePackages = "com.example.demo.dao")
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	private final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping ("/users")
	public List<User> user(@RequestParam(value="country",defaultValue = " ") String country) throws Exception {
//		final User param = new User(0, null, country);
		final User param = new User();
		final List<User> userList = userDAO.selectUsers(param);
		return userList;
	}
	
	@PostMapping("/users")
	public void user(@RequestBody User user) {
//		final User param = new User(user.getSeq(), user.getName(), user.getCountry());
		logger.info(user.toString());
		
		try {
			userDAO.insertUser(user);	
		}catch(Exception e) {
			
		}
		
		
	}
	


}
