package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	//http://localhost:8282/policy/findPolicy

	@GetMapping(path="/findPolicy/{pid}")
	public Policy findById(@PathVariable("pid") int pid)
	{ 
	return polyservice.findById(pid);

	}
	
	//http://localhost:8282/policy/addpolicy

	@PostMapping("/addpolicy")
	public int addInsurance(@RequestBody Policy p)
	{
	return polyservice.addPolicy(p);
	}
			
			
			
}
