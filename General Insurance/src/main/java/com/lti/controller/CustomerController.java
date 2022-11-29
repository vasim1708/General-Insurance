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

import com.lti.beans.Customer;
import com.lti.beans.User;
import com.lti.service.CustomerService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService custumerService;
	
		//http://localhost:8282/customer/addcustomer
		@PostMapping("/addcustomer")
		public int addCustomer(@RequestBody Customer c)
		{
			return custumerService.addCustomer(c);
		}
		
		//http://localhost:8282/customer/findcustomer/11
		@GetMapping("/findcustomer/{cid}")
		public Customer findCustomer(@PathVariable("cid") int CustId){
			return custumerService.findCustomer(CustId);
		}
		
		//http://localhost:8282/customer/deletecustomer/12

		@DeleteMapping("/deletecustomer/{cid}")
		public void deleteCustomer(@PathVariable("cid") int CustId)
		{
			custumerService.deleteCustomer(CustId);
			
		}
		
		//http://localhost:8282/customer/allcustomers
		@GetMapping("/allcustomers")
		public List<Customer> getAllCustomers()
		{
			return custumerService.getAllCustomers();
		}
		
	
	

}
