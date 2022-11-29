package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.InsurancePlan;
import com.lti.dao.InsurancePlanDao;


@Service("insservice")
public class InsurancePlanServiceImpl implements InsurancePlanService {
	@Autowired
	InsurancePlanDao dao;
	@Override
	public int addInsurance(InsurancePlan i) {
		int addInsurance = dao.addInsurance(i);
		return addInsurance;
	}
	@Override
	public InsurancePlan findById(int id) {
		InsurancePlan i1=dao.findById(id);
		return i1;
	}
	@Override
	public List<InsurancePlan> getAllInsurancePlan() {
		List<InsurancePlan> List=dao.getAllInsurancePlan();
		return List;
	}

}
