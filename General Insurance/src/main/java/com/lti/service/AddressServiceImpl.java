package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Address;
import com.lti.dao.AddressDao;

@Service ("addService")
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddressDao dao;

	@Override
	public int addAddress(Address a) {
		
		int addId=dao.addAdress(a);
		return addId;
	}

}
