package com.devba.web.controller.service;

import java.util.List;

import com.devba.web.controller.entity.UserInfo;


public interface IUserManager {

	public void addUser(UserInfo userInfo);
	
	public List<UserInfo> getAllUser();
	
	public boolean deleteUser(String id);
	
	public UserInfo getUser(String id);
	
	public boolean updateUser(UserInfo userInfo);
	
}
