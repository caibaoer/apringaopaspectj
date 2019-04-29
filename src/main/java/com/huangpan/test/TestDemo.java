package com.huangpan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huangpan.service.UserService;



public class TestDemo {

	public static void main(String[] args) {
		
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userServiceImpl=(UserService)applicationContext.getBean("userServiceId");
		userServiceImpl.get();
		

	}

}
