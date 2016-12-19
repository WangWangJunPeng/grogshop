package com.wjp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wjp.mapper.UserMapper;
import com.wjp.pojo.User;
import com.wjp.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	public List<User> getUsers() {
		//List<User> users = userMapper.selectUsers();
		return userMapper.selectUsers();
	}

	public int deleteUser(String username) {
		return userMapper.deleteByName(username);
	}

	public List<User> getUserByUsername(String username) {
		//List<User> users = userMapper.selectByUsername(username);
		return userMapper.selectByUsername(username);
	}
}
