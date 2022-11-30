package com.lti.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.beans.Vehicle;


@Repository
public interface VehicleDao {

	int addEmployee(Vehicle v);

	List<Vehicle> getAllVehicle();

	boolean deleteVehicle(int vid);

}
