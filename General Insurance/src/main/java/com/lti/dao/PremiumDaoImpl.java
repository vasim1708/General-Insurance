package com.lti.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Premium;
@Repository

public class PremiumDaoImpl implements PremiumDao {
	@PersistenceContext 
	 private EntityManager em;
	
	
	@Transactional
	@Override
	public Premium findById(int id) {
		Premium p = em.find(Premium.class, id);
		return p;
}


	@Override
	public List<Premium> getAllPremium() {
		Query qry = em.createQuery("Select p from Premium p");
        List<Premium> List=qry.getResultList();
       return List;
		
	}


	@Override
	public int addPremium(Premium p) {
		em.persist(p);
		return p.getId();
	
	}
}
