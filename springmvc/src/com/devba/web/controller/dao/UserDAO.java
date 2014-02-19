package com.devba.web.controller.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.devba.web.controller.entity.UserInfo;


public class UserDAO implements IUserDAO {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(UserInfo userInfo) {
		sessionFactory.getCurrentSession().save(userInfo);
	}

	@Override
	public List<UserInfo> getAllUser() {
		String hql = "from UserInfo";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public boolean deleteUser(String id) {
		String hql = "delete UserInfo u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (query.executeUpdate() > 0);
	}

	@Override
	public UserInfo getUser(String id) {
		String hql = "from UserInfo u where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (UserInfo) query.uniqueResult();
	}

	@Override
	public boolean updateUser(UserInfo userInfo) {
		String hql = "update UserInfo u set u.userName=?,u.userPwd=?,u.age=? where u.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, userInfo.getUserName());
		query.setString(1, userInfo.getUserPwd());
		query.setString(2, userInfo.getAge());
		query.setString(3, userInfo.getId());
		return (query.executeUpdate()>0);
	}

}
