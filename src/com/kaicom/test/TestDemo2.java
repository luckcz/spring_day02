package com.kaicom.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/kaicom/test/applicationContext.xml")
public class TestDemo2 {
	//将名为user的对象注入到u变量中
	@Resource(name="userServiceImpl2")
	private UserService userService;
	
	@Test
	public void fun1(){
		try{
			userService.insert();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
