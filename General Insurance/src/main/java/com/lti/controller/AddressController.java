package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Address;
import com.lti.beans.User;
import com.lti.service.AddressService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/address")
public class AddressController {
	
	
	@Autowired
	AddressService addService;
	
	//http://localhost:8282/address/addaddress
	@PostMapping("/addaddress")
	public int addAddres(@RequestBody Address a)
	{
		return addService.addAddress(a);
	}
	
	//http://localhost:8282/address/findaddress/1
	@GetMapping("/findaddress/{aid}")
	public Address findAddress(@PathVariable("aid") int addId){
		return addService.findAddress(addId);
	}
	
	//http://localhost:8282/address/deleteaddress/1
	@DeleteMapping("/deleteaddress/{aid}")
	public void deleteAddress(@PathVariable("aid") int addId)
	{
		addService.deleteAddress(addId);
		
	}

}
