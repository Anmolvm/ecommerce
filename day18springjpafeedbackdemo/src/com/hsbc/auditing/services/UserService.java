package com.hsbc.auditing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.auditing.models.User;
import com.hsbc.auditing.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public User addUser(User user)
	{
		return userRepository.save(user);
	}
	
	
	public List<User> getAllUsers()
	{
		return userRepository.findAll();
	}
	
	
	public User getUserById(Long id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	
	
}
