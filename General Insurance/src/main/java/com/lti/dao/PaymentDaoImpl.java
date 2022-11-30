package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Payment;


@Repository
public class PaymentDaoImpl implements PaymentDao {
	@PersistenceContext
	private EntityManager em;
	@Override
	@Transactional
	public Payment payment(Payment p) {
		// TODO Auto-generated method stub
	      em.persist(p);
		return p;
	}

}