package com.lti.service;

import java.util.List;

import com.lti.beans.Customer;
import com.lti.beans.User;

public interface CustomerService {

	int addCustomer(Customer c);

	Customer findCustomer(int custId);

	void deleteCustomer(int custId);

	List<Customer> getAllCustomers();
	
	

}
