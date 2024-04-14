package com.service;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
@Autowired
LoginRepository loginRepository;
public String signup(Login login) {
	
}
}
