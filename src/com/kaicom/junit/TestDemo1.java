package com.kaicom.junit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kaicom.bean.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo1 {
	//将名为user的对象注入到u变量中
	@Resource(name = "user")
	private User u ;
	
	@Test
	public void fun1(){
		try{
			System.out.println(u);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
