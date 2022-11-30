package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Customer;
import com.lti.beans.User;

@Repository
public class UserDaoImpl  implements UserDao{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addUser(User u) {
		em.persist(u);
		return u.getUserId();
	}

	@Override
	@Transactional
	public User findUser(int userId) {
		User e = em.find( User.class , userId);

		return e;	}

	@Override
	@Transactional
	public void deleteUser(int userId) {
		User u=em.find(User.class, userId);
		em.remove(u);
		
		
	}

	@Override
	public List<User> getAllUsers() {
		Query qry = em.createQuery("Select u from User u "); 
		List<User> List2 = qry.getResultList(); 
		

		return List2;
	}
	

		
	

}
