package com.lti.dao;

import java.util.List;

import com.lti.beans.Customer;

public interface CustomerDao {

	int addCustomer(Customer c);

	Customer findCustomer(int custId);

	void deleteCustomer(int custId);

	List<Customer> getAllCustomers();

}
