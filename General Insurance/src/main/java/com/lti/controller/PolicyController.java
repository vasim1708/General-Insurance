package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Policy;
import com.lti.service.PolicyService;



@RequestMapping("/policy")
@RestController
@CrossOrigin
public class PolicyController {
	@Autowired
	private PolicyService polyservice;





	//http://localhost:8282/policy/getAllPolicy
	@GetMapping(path="/getAllPolicy")
	public List<Policy> getAllPolicy(){
		return polyservice.getAllPolicy();
	}
	
	//http://localhost:8282/insurance/findInsurance

	@GetMapping(path="/findPolicy/{id}")
	public Policy findById(int id) {
	return polyservice.findById(id);

	}
	
	//http://localhost:8282/insurance/addins

	@PostMapping("/addpolicy")
	public int addInsurance(@RequestBody Policy p)
	{
	return polyservice.addPolicy(p);
	}
			
			
			
}
