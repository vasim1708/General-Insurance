package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao {
	

@PersistenceContext
	private EntityManager em;
	@Override
	
	@Transactional
	public int addEmployee(Vehicle v) {
		// TODO Auto-generated method stub
		em.persist(v);
		return v.getId();
	}
	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT v FROM Vehicle v");
		List<Vehicle> list =query.getResultList(); 
		return list;
	}
	@Override
	public boolean deleteVehicle(int vid) {
		// TODO Auto-generated method stub
		Vehicle v  = em.find(Vehicle.class, vid);
	    em.remove(v);
		return true;
	}



}
