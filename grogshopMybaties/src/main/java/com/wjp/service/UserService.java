package com.wjp.service;

import java.util.List;

import com.wjp.pojo.User;

public interface UserService {
	List<User> getUsers();
	int deleteUser(String username);
	List<User> getUserByUsername(String username);
}
