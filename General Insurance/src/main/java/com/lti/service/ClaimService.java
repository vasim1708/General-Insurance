package com.lti.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.lti.beans.Claim;


@Service
public interface ClaimService {

	

	int addClime(Claim c);

	List<Claim> getAllClaim();

	boolean updateClaimStatus(int climeId, Claim c);

	Claim findById(int cid);
	

		
	
}
