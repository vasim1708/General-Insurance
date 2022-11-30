package com.lti.dao;

import java.util.List;

import com.lti.beans.User;

public interface UserDao {

	int addUser(User u);

	User findUser(int userId);

	void deleteUser(int userId);

	List<User> getAllUsers();

}
