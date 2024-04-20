package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Login;
import com.repository.LoginRepository;

@Service
public class LoginService {
@Autowired
LoginRepository loginRepository;

public String signUp(Login login) {
java.util.Optional<Login> result=loginRepository.findById(login.getEmailid());
if(((java.util.Optional<Login>) result).isPresent()) {
	return "Account already exists";
}else {
	if(login.getTypeofuser().equals("admin")) {
		return "Admin account cannot be created";
	}else {
		loginRepository.save(login);
		return "Account created successfully";
	}
} }

public String signIn(Login login) {
	java.util.Optional<Login> result=loginRepository.findById(login.getEmailid());
	if(result.isPresent()) {
	Login ll=result.get();
	if(ll.getPassword().equals(login.getPassword())) {
		if(login.getTypeofuser().equals("admin")) {
			return "Admin logged in succesfully";
		}
		else {
			return "Customer logged in succesfully";
		}
	}else {
		return "Password is incorrect";
	}
	}else {
			return "Email id entered is wrong";
		}
	}
	}

