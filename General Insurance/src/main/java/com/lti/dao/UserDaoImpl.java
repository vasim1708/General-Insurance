package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.User;

@Repository
public class UserDaoImpl  implements UserDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addUser(User u) {
		em.persist(u);
		return u.getId();
	}

	@Override
	@Transactional
	public User findUser(int userId) {
		User e = em.find( User.class , userId);

		return e;	}

	@Override
	public void deleteUser(int userId) {
		User u=em.find(User.class, userId);
		em.remove(u);
		
		
	}
	


}
