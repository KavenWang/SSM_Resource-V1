package com.javan.manager.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.javan.entity.Person;
import com.javan.manager.service.IUserService;
import com.javan.service.impl.DroolsTestServiceImpl;

public class DroolsTest extends SpringBaseTest{
	@Autowired
	public DroolsTestServiceImpl droolsTestService;
	@Test
	public void test1(){
		
		Person p1 = new Person("白展堂", 68);
		System.out.println("before p1 : " + p1);
		droolsTestService.getNewPerson(p1);
		System.out.println("after p1 : "+p1);
	}
}
