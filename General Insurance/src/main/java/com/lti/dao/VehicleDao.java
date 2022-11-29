package com.lti.dao;

import java.util.List;

import com.lti.entity.Vehicle;

public interface VehicleDao {

	int addEmployee(Vehicle v);

	List<Vehicle> getAllVehicle();

	boolean deleteVehicle(int vid);

}
