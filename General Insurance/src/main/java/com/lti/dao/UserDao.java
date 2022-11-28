package com.lti.dao;

import com.lti.beans.User;

public interface UserDao {

	int addUser(User u);

	User findUser(int userId);

	void deleteUser(int userId);

}
