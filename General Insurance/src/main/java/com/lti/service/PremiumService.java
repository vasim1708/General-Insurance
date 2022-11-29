package com.lti.service;

import java.util.List;

import com.lti.beans.Premium;


public interface PremiumService {

	

	Premium findById(int id);

	List<Premium> getAllPremium();

	int addPremium(Premium p);

}
