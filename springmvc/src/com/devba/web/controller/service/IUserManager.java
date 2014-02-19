package com.devba.web.controller.service;

import java.util.List;

import com.devba.web.controller.entity.User;


public interface IUserManager {

	public void addUser(User user);
	
	public List<User> getAllUser();
	
	public boolean deleteUser(String id);
	
	public User getUser(String id);
	
	public boolean updateUser(User user);
	
}
