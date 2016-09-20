package com.javan.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.javan.manager.service.IUserService;

@Controller("user")
public class UserController {
	@Autowired
	private IUserService userService;
}
