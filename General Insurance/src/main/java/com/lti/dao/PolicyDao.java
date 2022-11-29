package com.lti.dao;

import java.util.List;

import com.lti.beans.Policy;

public interface PolicyDao {

	List<Policy> getAllPolicy();

	Policy findById(int pid);

	int addPolicy(Policy p);

}
