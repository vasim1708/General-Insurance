package com.lti.dao;

import java.util.List;

import com.lti.beans.Premium;

public interface PremiumDao{
	
	Premium findById(int id);
	List<Premium> getAllPremium();
	int addPremium(Premium p);

}