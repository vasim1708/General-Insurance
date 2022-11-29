package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addCustomer(Customer c) {
		em.persist(c);
		return c.getCustid();
	}

	@Override
	@Transactional
	public Customer findCustomer(int custId) {
		Customer c = em.find(Customer.class, custId);
		return c;
	}

	@Override
	@Transactional
	public void deleteCustomer(int custId) {
		Customer c = em.find(Customer.class, custId);
		em.remove(c);
		
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		Query qry = em.createQuery("Select c from Customer c ");       
        List<Customer> custList1 = qry.getResultList();  
        return custList1;
		
		
	}

}
