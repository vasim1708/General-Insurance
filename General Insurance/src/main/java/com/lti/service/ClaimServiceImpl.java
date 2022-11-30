package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Claim;
import com.lti.dao.ClimeInsurencedao;




@Service()
public class ClaimServiceImpl implements ClaimService {
	@Autowired
	ClimeInsurencedao dao;
	
	@Override
	public int addClime(Claim c) {
		// TODO Auto-generated method stub
		int claimNo = dao.addClaim(c);
		
		return claimNo;
	}

	@Override
	public List<Claim> getAllClaim() {
		// TODO Auto-generated method stub
		List<Claim> em = dao.getAllClaim();
		return em;
	}

	@Override
	public boolean updateClaimStatus(int climeId ,Claim c) {
		// TODO Auto-generated method stub
		return dao.updateClaimStatus(climeId, c);
		
	}

	@Override
	public Claim findById(int cid) {
		// TODO Auto-generated method stub
		return dao.getById(cid);
		
	}

	
}