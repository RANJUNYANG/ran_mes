package com.red.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.red.dao.UserMapper;
import com.red.model.User;

public class Spring_MybatisTest {
	
	private static ApplicationContext bean=new ClassPathXmlApplicationContext("spring\\applicationContext.xml");
	private UserMapper userMapper;
	
	@Test
	public void testMapper() {
		userMapper=bean.getBean(UserMapper.class);
		User user=User.builder().username("yang").telephone("123456").build();
		userMapper.insertSelective(user);
	}
	
	

}