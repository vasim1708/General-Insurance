package com.lti.dao;

import com.lti.beans.Address;

public interface AddressDao {

	int addAdress(Address a);

	Address findAdress(int addId);

	void deleteAddress(int addId);

}
