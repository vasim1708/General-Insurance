package com.lti.service;

import java.util.List;

import com.lti.beans.Vehicle;

public interface VehicleService {
	

	int addVehicle(Vehicle v);

	List<Vehicle> getAllVehicle();

	boolean deletevehicle(int vid);


}
