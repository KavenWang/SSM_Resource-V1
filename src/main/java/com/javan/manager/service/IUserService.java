package com.javan.manager.service;

import com.javan.manager.entity.User;

public interface IUserService {

	public int insertUser(User user) throws Exception;
	public int deleteUserByUserid(String userid) throws Exception;
	public int updateUserByUserid(User user) throws Exception;
	public User selectUserByUserid(String userid) throws Exception;
}
