package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Customer;
import com.lti.beans.User;
import com.lti.dao.CustomerDao;

@Service("custumerService")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public int addCustomer(Customer c) {
		int customerNo = dao.addCustomer(c);
		return customerNo;
	}

	@Override
	public Customer findCustomer(int custId) {
		Customer c = dao.findCustomer(custId);
		return c;
	}

	@Override
	public void deleteCustomer(int custId) {
		
		dao.deleteCustomer(custId);
		
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> custList1=dao.getAllCustomers();
		
		return custList1;
	}

}
