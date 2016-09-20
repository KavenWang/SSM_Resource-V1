package com.javan.manager.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class) //junit和spring单元测试
@ContextConfiguration(locations={"classpath:applicationContext.xml"}) 
public class SpringBaseTest extends AbstractJUnit4SpringContextTests{
	public <T> T getBean(Class<T> type){ 
		return applicationContext.getBean(type);        
		
	}              
	public Object getBean(String beanName){ 
		return applicationContext.getBean(beanName); 
		}         
	protected ApplicationContext getContext(){        
		return applicationContext;        }     
	@Test     
	public void testApplicationContext(){
		ApplicationContext ac = getContext();         
		System.out.println("----------------------->ApplicationContent:"+ac);    }
}
