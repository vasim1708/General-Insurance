package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.beans.Vehicle;
import com.lti.dao.VehicleDao;

@Service
public class VehicleServiceImpl implements VehicleService{
	
	
	@Autowired
	
	VehicleDao dao;
	@Override
	public int addVehicle(Vehicle v) {
		// TODO Auto-generated method stub
		
		return dao.addEmployee(v);
	}
	@Override
	public List<Vehicle> getAllVehicle() {
		// TODO Auto-generated method stub
		List<Vehicle> list = dao.getAllVehicle();
		return list;
	}
	@Override
	public boolean deletevehicle(int vid) {
		// TODO Auto-generated method stub
		return dao.deleteVehicle(vid);
		
	}


}
