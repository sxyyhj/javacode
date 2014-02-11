package com.ydsn.web.controller.service;

import java.util.List;

import com.ydsn.web.controller.dao.IUserDAO;
import com.ydsn.web.controller.entity.User;

public class UserManager implements IUserManager {

	private IUserDAO userDao;

	public void setUserDao(IUserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

	@Override
	public boolean deleteUser(String id) {
		return userDao.deleteUser(id);
	}

	@Override
	public User getUser(String id) {
		return userDao.getUser(id);
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

}
