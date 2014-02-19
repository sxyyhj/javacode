package com.devba.web.controller.dao;

import java.util.List;

import com.devba.web.controller.entity.UserInfo;


public interface IUserDAO {

	public void addUser(UserInfo userInfo);
	
	public List<UserInfo> getAllUser();
	
	public boolean deleteUser(String id);
	
	public UserInfo getUser(String id);
	
	public boolean updateUser(UserInfo userInfo);
	
}
