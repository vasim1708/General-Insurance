package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Claim;
import com.lti.dao.ClaimDao;

@Service("claimService")
public class ClaimServiceImpl implements ClaimService {
	
	@Autowired
	ClaimDao dao;

	@Override
	public int addClaim(Claim c) {
		
		int claimNo=dao.addClaim(c);
		
		return claimNo;
	}

}
