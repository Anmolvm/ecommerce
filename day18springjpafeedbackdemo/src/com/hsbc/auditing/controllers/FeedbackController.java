package com.hsbc.auditing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hsbc.auditing.models.User;
import com.hsbc.auditing.services.FeedbackService;
import com.hsbc.auditing.services.UserService;


@Controller
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private UserService userService;
	
	@ModelAttribute("users")
	public List<User> getUser()
	{
		return userService.getAllUsers();
	}
	
	
	
	@GetMapping("/addfeedback")
	public String addFeedback()
	{
		return "addfeedback";
		
	}
	
	@PostMapping("/addfeedbackdata")
	public String addFeedbackData(@RequestParam long userId, @RequestParam int rating)
	{
		System.out.println(userId+rating);
		  feedbackService.addFeedback(rating, userId);
		   
		   return "home";
		
	}
	
}
