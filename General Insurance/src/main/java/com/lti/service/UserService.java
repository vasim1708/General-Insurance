package com.lti.service;

import org.springframework.stereotype.Service;

import com.lti.beans.User;


public interface UserService {

	//User login(User user);

	int addUser(User u);

	User findUser(int userId);

	void deleteUser(int userId);

}
