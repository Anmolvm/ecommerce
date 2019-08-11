package com.hsbc.auditing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.auditing.models.Feedback;
import com.hsbc.auditing.models.User;
import com.hsbc.auditing.repositories.FeedbackRepository;


@Service
public class FeedbackService {

	@Autowired
	private FeedbackRepository feedbackRepository;
	@Autowired
	private UserService userService;
	
	private Feedback feedback;
	
	public Feedback addFeedback(int rating,long userId)	
	{
		User user=userService.getUserById(userId);
		feedback=new Feedback();
		feedback.setRating(rating);
		feedback.setUser(user);
		return feedbackRepository.save(feedback);
		
	}
	
	public List<Feedback> getAllFeedback()
	{
		return feedbackRepository.findAll();
	}
	
	
	
}
