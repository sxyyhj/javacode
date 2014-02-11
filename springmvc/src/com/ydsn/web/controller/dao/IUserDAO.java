package com.ydsn.web.controller.dao;

import java.util.List;

import com.ydsn.web.controller.entity.User;

public interface IUserDAO {

	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public boolean deleteUser(String id);
	
	public User getUser(String id);
	
	public boolean updateUser(User user);
	
}
