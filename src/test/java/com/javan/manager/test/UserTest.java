package com.javan.manager.test;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.javan.manager.entity.User;
import com.javan.manager.service.IUserService;
import com.javan.manager.service.impl.UserServiceImpl;
import com.javan.utils.ApplicationContextUtil;

public class UserTest extends SpringBaseTest{
	//IUserService userService = (IUserService)ApplicationContextUtil.getContext().getBean("userService");
	@Autowired
	private IUserService userService;
	@Test
	public void insertUser(){
		User user = new User();
		user.setUserid("002");
		user.setUsername("李四");
		user.setAccount("lisi");
		user.setAddress("1");
		user.setBustype("1");
		user.setCardid("1");
		user.setCertcode("1");
		user.setCerttype("1");
		user.setDeptid("001011113");
		user.setEmail("wagnwei@163.com");
		user.setEnabled("1");
		user.setLocked("0");
		user.setLogincount(new BigDecimal("1"));
		user.setLogintime(new Date());
		user.setMobile("1111111");
		user.setPassword("123456");
		user.setPersonid("1");
		user.setUsertype("1");
		user.setSex("1");
		user.setRemark("11111");
		user.setTelephone("13838034577");
		try {
			System.out.println("-------前-----");
			 userService.insertUser(user);
			 System.out.println("------后------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
	/*public int deleteUserByUserid(String userid){
		
	}
	public int updateUserByUserid(User user){
		
	}
	public User selectUserByUserid(String userid){
		
	}*/
}
