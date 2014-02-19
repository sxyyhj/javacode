package com.devba.web.controller.service;

import java.util.List;

import com.devba.web.controller.dao.IUserDAO;
import com.devba.web.controller.entity.UserInfo;


public class UserManager implements IUserManager {

	private IUserDAO userDao;

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(UserInfo userInfo) {
		userDao.addUser(userInfo);
	}

	@Override
	public List<UserInfo> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public boolean deleteUser(String id) {
		return userDao.deleteUser(id);
	}

	@Override
	public UserInfo getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	public boolean updateUser(UserInfo userInfo) {
		return userDao.updateUser(userInfo);
	}

}
