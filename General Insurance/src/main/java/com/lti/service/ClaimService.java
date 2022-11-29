package com.lti.service;

import java.util.List;

//import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.entity.Claim;

//import com.lti.entity.Claim;
//import com.lti.entity.Customer;
//import com.lti.entity.Policy;
@Service
public interface ClaimService {

	

	int addClime(Claim c);

	List<Claim> getAllClaim();

	

	boolean updateClaimStatus(int climeId, Claim c);

	Claim findById(int cid, Claim c);
	

//		void saveAndUpdateOfClaimInsurenceDetails(Claim c);
//		List<Claim> getClaimInsurence(int id);
//		Claim getClaimDataBtId(int id);
//		Customer findByCustomerId(int id);
//		Policy findByPolicyId(int id);
//		
	
}
