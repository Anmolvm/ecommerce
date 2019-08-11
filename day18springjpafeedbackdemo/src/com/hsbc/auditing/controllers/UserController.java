package com.hsbc.auditing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.auditing.models.User;
import com.hsbc.auditing.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home()
	{
		return "home";
		
	}
	@GetMapping("/adduser")
	public ModelAndView addUser()
	{
		return new ModelAndView("adduser","user", new User());
		
	}
	
	@PostMapping("/adduserdata")
	public String addUserData(@ModelAttribute("user") @Validated User user,
			BindingResult bindingResult, Model model)
	{
		
		   userService.addUser(user);
		   return "home";
		
	}

}
