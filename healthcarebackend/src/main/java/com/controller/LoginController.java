package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.LoginService;

@RestController
@RequestMapping("login")

public class LoginController {
	@Autowired
	LoginService loginService;
	

}
