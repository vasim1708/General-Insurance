package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Payment;
import com.lti.dao.PaymentDao;

;
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	
	private PaymentDao dao;
	@Override
	public Payment payment(Payment p) {
		// TODO Auto-generated method stub
		Payment payment = dao.payment(p);
		return payment;
	}

}