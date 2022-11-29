package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Policy;

import com.lti.dao.PolicyDao;

@Service("polyservice")
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	PolicyDao dao;
	@Override
	public List<Policy> getAllPolicy() {
			List<Policy> List=dao.getAllPolicy();
			return List;
	
	}
	@Override
	public Policy findById(int id) {
		Policy p1=dao.findById(id);
		return p1;
	
	}
	@Override
	public int addPolicy(Policy p) {
		int addPolicy = dao.addPolicy(p);
		return addPolicy;
	}

}
