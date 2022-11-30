package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Policy;
@Repository
public class PolicyDaoImpl implements PolicyDao {
	
	
	@PersistenceContext 
	private EntityManager em;
	
	@Override
	public List<Policy> getAllPolicy() {
			Query qry = em.createQuery("select plan from Policy as plan");
			List<Policy> list = qry.getResultList();
			return list;
	
	}
	@Override
	public Policy findById(int pid) {
		Policy p = em.find(Policy.class, pid);
		return p;
	}
	@Override
	@Transactional
	public int addPolicy(Policy p) {
		em.persist(p);
		return p.getId();
	}
	

}
