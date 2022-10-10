package com.neo.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neo.sp.model.User;
import com.neo.sp.repository.UserRepository;

@Service

public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user) {
		return userRepository.save(user);
	}	

}
