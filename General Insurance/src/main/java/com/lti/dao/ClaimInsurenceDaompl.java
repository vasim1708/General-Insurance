package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.beans.Claim;



@Repository
public class ClaimInsurenceDaompl implements ClimeInsurencedao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addClaim(Claim c) {
		// TODO Auto-generated method stub
	em.persist(c);
		
		return c.getId();
	}

	@Override
	public List<Claim> getAllClaim() {
		// TODO Auto-generated method stub
		Query qry = em.createQuery("SELECT c FROM Claim c");
		List<Claim> list = qry.getResultList();
		return list;
	}

	@Override
	@Transactional
	public boolean updateClaimStatus(int claimId ,Claim c) {
		// TODO Auto-generated method stub
		Claim claim = em.find(Claim.class, claimId);
		claim.setStatus(c.getStatus());
		em.merge(claim);
		return true;
	}

	@Override
	public Claim getById(int cid) {
		// TODO Auto-generated method stub
		
		return em.find(Claim.class, cid);
	}
	
}


