package com.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.javaguides.springboot.model.User;
import com.javaguides.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}