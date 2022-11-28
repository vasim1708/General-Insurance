package com.lti.dao;

import java.util.List;

import com.lti.entity.Claim;
import com.lti.entity.Customer;
import com.lti.entity.Policy;



public interface ClimeInsurencedao {

	void submitAndUpdatingofClimeInsurence(Claim c);
	Claim fetchDataByIdForClaimInsurence(int id);
	List <Claim> fetchAllCliamData();
	Customer findByCustomerId(int id) ;
	Policy findByPolicyId(int id);
}
