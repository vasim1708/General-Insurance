package com.lti.service;

import java.util.List;

import com.lti.beans.Policy;

public interface PolicyService {

	List<Policy> getAllPolicy();

	Policy findById(int id);

	int addPolicy(Policy p);

}
