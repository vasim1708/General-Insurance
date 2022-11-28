package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Address;
import com.lti.service.AddressService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	AddressService addService;
	
	//http://localhost:8282/user/addaddress
	@PostMapping("/addaddress")
	public int addAddres(@RequestBody Address a)
	{
		return addService.addAddress(a);
	}

}
