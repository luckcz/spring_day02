package com.kaicom.springaopanno;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:com/kaicom/springaopanno/applicationContext.xml")
public class TestDemo1 {
	//将名为user的对象注入到u变量中
	@Resource(name = "userService")
	private UserService u ;
	
	@Test
	public void fun1(){
		try{
			u.insert();
			u.update();
			System.out.println(u);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
