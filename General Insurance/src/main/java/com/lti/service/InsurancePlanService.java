package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.beans.InsurancePlan;


@Service
public interface InsurancePlanService {

	int addInsurance(InsurancePlan i);

	   InsurancePlan findById(int Inid);

	   List<InsurancePlan> getAllInsurancePlan();

}

