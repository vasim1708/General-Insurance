package com.lti.service;

import com.lti.beans.Address;
import com.lti.beans.User;

public interface AddressService {

	int addAddress(Address a);

	Address findAddress(int addId);

	void deleteAddress(int addId);

}
