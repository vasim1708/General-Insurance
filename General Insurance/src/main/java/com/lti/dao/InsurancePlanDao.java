package com.lti.dao;

import java.util.List;

import com.lti.beans.InsurancePlan;

public interface InsurancePlanDao {

	

	int addInsurance(InsurancePlan i);

	InsurancePlan findById(int id);

	List<InsurancePlan> getAllInsurancePlan();

}
