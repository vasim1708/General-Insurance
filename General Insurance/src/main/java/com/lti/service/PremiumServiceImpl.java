package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Premium;
import com.lti.dao.PremiumDao;
@Service("premiumservice")
public class PremiumServiceImpl implements PremiumService {
	@Autowired
	PremiumDao dao;
	@Override
	public Premium findById(int id) {
		
		Premium p=dao.findById(id);
		return p;
	
	}

	@Override
	public List<Premium> getAllPremium() {
		List<Premium> List=dao.getAllPremium();
		return List;
	}

	@Override
	public int addPremium(Premium p) {
		int addPremium = dao.addPremium(p);
		return addPremium;

	}
	
	
}