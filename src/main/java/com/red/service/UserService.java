package com.red.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.red.dao.UserMapper;
import com.red.model.User;

@Service
public class UserService {
    @Resource
	private UserMapper userMapper;
    
    public void insertTest() {
		User user=User.builder().username("yang").telephone("123456").build();
		userMapper.insertSelective(user);
	}

	public void insertTestAjax(User userVo) {
		userMapper.insertSelective(userVo);
	}
    
}
