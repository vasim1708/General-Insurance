package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
ClaimService claimservice;
//http://localhost:8282/claim/addclaim
@PostMapping("/addclaim")
public int addClaim(@RequestBody Claim c) {
	return claimservice.addClime(c);
}
//http://localhost:8282/claim/getclaim
@GetMapping("/getclaim")

public List<Claim> getClaim(){
	return claimservice.getAllClaim();
}

//http://localhost:8282/claim/updateclaimstatus/101
@PutMapping("/updateclaimstatus/{cid}")
public boolean updatClaimStatus(@PathVariable("cid") int cid,@RequestBody Claim c){
	claimservice.updateClaimStatus(cid, c);
	return true;
}
//http://localhost:8282/claim/findbyclaimid/101
@GetMapping("findbyclaimid/{cid}")
public Claim findById(@PathVariable("cid") int cid) {
	return claimservice.findById(cid);
}

}
