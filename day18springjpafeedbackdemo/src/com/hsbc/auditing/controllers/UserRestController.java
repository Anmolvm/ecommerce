package com.hsbc.auditing.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.auditing.models.User;
import com.hsbc.auditing.services.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/welcome")
	public String getData()
	{
		return "Hi!!!";
	}
	
	
	@GetMapping("/getuser/{mobileNo}")
	public @ResponseBody User getUsers(@PathVariable("mobileNo") long mobileNo)
	{
		return userService.getUserById(mobileNo);
		
		
		
	}
	@GetMapping("/getallusers")
	public @ResponseBody List<User> getAllUsers()
	{
		return userService.getAllUsers();
		
		
		
	}
	
	

}
