package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Vehicle;
import com.lti.service.VehicleService;

@CrossOrigin
@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	VehicleService vehicleservice;
	//http://localhost:8282/vehicle/addvehicle
	@PostMapping("/addvehicle")
	public int addVehicle(@RequestBody Vehicle v) {
		return vehicleservice.addVehicle(v);
	}
	//http://localhost:8282/vehicle/getallvehicle
	@GetMapping("/getallvehicle")
	public List<Vehicle> getAllVehicle(){
		 List<Vehicle>  list=vehicleservice.getAllVehicle();
		return list;
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteVehical(@PathVariable("id") int id) {
		return vehicleservice.deletevehicle(id);
	}
}