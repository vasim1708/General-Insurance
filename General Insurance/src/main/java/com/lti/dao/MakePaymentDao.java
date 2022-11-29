package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.entity.Payment;
@Repository
public interface MakePaymentDao {

	
	Payment payment(Payment p);

}
