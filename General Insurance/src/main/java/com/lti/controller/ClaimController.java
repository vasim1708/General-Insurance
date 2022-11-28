package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Claim;
import com.lti.service.ClaimService;

@CrossOrigin
@RestController
@RequestMapping("/claim")
public class ClaimController {
	
	@Autowired
	ClaimService claimService;
	
	
	@PostMapping("/addclaim")
	
	public int addClaim(@RequestBody Claim c)
	{
		return claimService.addClaim(c);
	}
	
	
	
	
	

}
