package com.javan.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javan.manager.entity.User;
import com.javan.manager.mapper.UserMapper;
import com.javan.manager.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public int insertUser(User user) throws Exception {
		return userMapper.insertUser(user);
	}

	@Override
	public int deleteUserByUserid(String userid) throws Exception {
		
		return userMapper.deleteUserByUserid(userid);
	}

	@Override
	public int updateUserByUserid(User user) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.updateUserByUserid(user);
	}

	@Override
	public User selectUserByUserid(String userid) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectUserByUserid(userid);
	}

}
