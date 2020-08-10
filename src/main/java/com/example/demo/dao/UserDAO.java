package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.User;

public interface UserDAO {
	List<User> selectUsers(User param) throws Exception;
	
	void insertUser(User param) throws Exception;

}
