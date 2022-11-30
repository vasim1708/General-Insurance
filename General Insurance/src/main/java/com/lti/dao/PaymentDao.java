package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.beans.Payment;


@Repository
public interface PaymentDao {

	
	Payment payment(Payment p);

}