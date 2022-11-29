package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.MakePaymentDao;
import com.lti.entity.Payment;
@Service
public class MakePaymentServiceImpl implements MakePaymentService {

	@Autowired
	
	private MakePaymentDao dao;
	@Override
	public Payment payment(Payment p) {
		// TODO Auto-generated method stub
		Payment payment = dao.payment(p);
		return null;
	}

}
