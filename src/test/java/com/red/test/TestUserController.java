package com.red.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.red.model.User;
import com.red.service.UserService;

@Controller
@RequestMapping("/test")
public class TestUserController {

//	@Resource
//	private TestUserMapper testUserMapper;
	@Resource
	private UserService userService;
	
	@RequestMapping("/testMethod")
	public String testMethod(Model model){
		String msg="hello";
		model.addAttribute("msg",msg);
		return "test";
	}
	
	@RequestMapping("/insert")
	public String testInsert(){
//		TestUser user=TestUser.builder().name("bean02").build();
//		testUserMapper.insertSelective(user);
		userService.insertTest();
		return "test";
	}
	
	@RequestMapping("/userTest.json")
	@ResponseBody
	public boolean testInsertAjax(User userVo) {
		userService.insertTestAjax(userVo);
		return true;
	}
	
	
}
