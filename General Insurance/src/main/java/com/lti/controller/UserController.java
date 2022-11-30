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
import com.lti.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	//http://localhost:8282/user/register
	@PostMapping("/register")
	public int addUser(@RequestBody User u)
	{
		return userService.addUser(u);
	}
	
	//http://localhost:8282/user/finduser

	@GetMapping("/finduser/{uid}")
	public User findUser(@PathVariable("uid") int userId){
		return userService.findUser(userId);
	}
	
	//http://localhost:8282/user/deleteuser

	@DeleteMapping("/deleteuser/{uid}")
	public void deleteUser(@PathVariable("uid") int userId)
	{
		userService.deleteUser(userId);
		
	}
	
	//http://localhost:8282/customer/allusers
			@GetMapping("/allusers")
			public List<User> getAllUsers()
			{
				return userService.getAllUsers();
			}
	
	

}
