package com.lti.dao;

import java.util.List;

import com.lti.beans.InsurancePlan;



public interface InsurancePlanDao {

	int addInsurance(InsurancePlan i);

	List<InsurancePlan> getAllInsurancePlan();

	InsurancePlan findById(int iid);

}
