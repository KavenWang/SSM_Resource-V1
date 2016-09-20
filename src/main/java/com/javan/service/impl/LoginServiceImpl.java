package com.javan.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.javan.entity.UserBean;
import com.javan.mapping.UserBeanMapper;
import com.javan.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {
	 @Resource
	 private UserBeanMapper um;


	 @Override
	 public UserBean Login(String username, String password) {
	     return um.login(username, password);
	 }
}
