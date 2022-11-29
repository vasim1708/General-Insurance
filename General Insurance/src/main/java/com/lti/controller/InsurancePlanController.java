package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.InsurancePlan;
import com.lti.service.InsurancePlanService;


@RequestMapping("/insurance")
@RestController
@CrossOrigin
public class InsurancePlanController {

	
	

		@Autowired
		private InsurancePlanService insservice;
		
		
		//http://localhost:8282/insurance/getAllInsurance
		@GetMapping(path="/getAllInsurance")
		public List<InsurancePlan> getAllInsurancePlans(){
			System.out.println("test");
			return insservice.getAllInsurancePlan();
		}
		
		//http://localhost:8282/insurance/findInsurance

		@GetMapping(path="/findInsurance/{id}")
		public InsurancePlan findById(int id) {
			return insservice.findById(id);

		}
		//http://localhost:8282/insurance/addins

		@PostMapping("/addins")
		public int addInsurance(@RequestBody InsurancePlan i)
		{
			return insservice.addInsurance(i);
		}
		
	}

