package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Address;


@Repository
public class AddressDaoImpl implements AddressDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addAdress(Address a) {
		em.persist(a);
		return a.getAddid();
	}

	@Override
	@Transactional
	public Address findAdress(int addId) {
		Address a= em.find(Address.class, addId);
		return a;
	}

	@Override
	@Transactional
	public void deleteAddress(int addId) {
		
		Address a=em.find(Address.class, addId);
		em.remove(a);
		
	}

}
