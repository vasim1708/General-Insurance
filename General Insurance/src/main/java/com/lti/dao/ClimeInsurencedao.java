package com.lti.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.entity.Claim;



@Repository
public interface ClimeInsurencedao {

	int addClaim(Claim c);

	boolean updateClaimStatus(int claim_id,Claim c);

	List<Claim> getAllClaim();

	Claim getById(int cid, Claim c);
}
