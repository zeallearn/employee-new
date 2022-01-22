package com.tech.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.tech.dto.UserRegistrationDto;
import com.tech.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
	User findByEmail(String userName);
}