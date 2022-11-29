package com.lti.service;

import java.util.List;

import com.lti.beans.InsurancePlan;

public interface InsurancePlanService {

	int addInsurance(InsurancePlan i);



	InsurancePlan findById(int id);



	List<InsurancePlan> getAllInsurancePlan();

}
