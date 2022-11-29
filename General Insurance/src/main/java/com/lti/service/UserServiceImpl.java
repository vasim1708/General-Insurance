package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.User;
import com.lti.dao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao dao;

	@Override
	public int addUser(User u) {
		int userNo = dao.addUser(u);
		return userNo;
	}

	@Override
	public User findUser(int userId) {
		
		User u=dao.findUser(userId);
		return u;
		
	}

	@Override
	public void deleteUser(int userId) {
		
		dao.deleteUser(userId);
		
	}

}
