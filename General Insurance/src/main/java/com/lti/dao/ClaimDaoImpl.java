package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.lti.beans.Claim;

@Repository
public class ClaimDaoImpl implements ClaimDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addClaim(Claim c) {
		em.persist(c);
		return c.getId();
	}

}
