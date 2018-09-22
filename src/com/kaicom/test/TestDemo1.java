package com.kaicom.test;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kaicom.bean.User;

public class TestDemo1 {
	@Test
	public void fun1(){
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u1 = ac.getBean(User.class);
		User u2 = ac.getBean(User.class);
		ac.close();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u1==u2);
	}
}
