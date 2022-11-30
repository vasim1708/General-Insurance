package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lti.beans.Premium;
import com.lti.service.PremiumService;

@RequestMapping("/premium")
@RestController
@CrossOrigin
public class PremiumController {
	
	@Autowired
	private PremiumService premiumservice;
	
	
	//http://localhost:8282/premium/findpremium
	@GetMapping(path="/findpremium/{id}")
	public Premium findById(int id) {
	return premiumservice.findById(id);
}
	//http://localhost:8282/premium/getAllPremium
	@GetMapping(path="/getAllPremium")
	public List<Premium> getAllPremium(){
		return premiumservice.getAllPremium();
	}
	
	//http://localhost:8282/premium/addpremium
	@PostMapping("/addpremium")
	public int addPremium(@RequestBody Premium p)
	{
		return premiumservice.addPremium(p);
	}
}