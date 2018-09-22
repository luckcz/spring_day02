package com.kaicom.proxy;

import org.junit.Test;

public class ProxyTest {
	private UserService userService = new UserServiceImpl();
	@Test
	public void fun1(){
		UserServiceProxyFactory factory = new UserServiceProxyFactory(userService);
		UserService userServiceProxy = factory.getUserServiceProxy();
		userServiceProxy.insert();
		userServiceProxy.update();
		userServiceProxy.delete();
		userServiceProxy.select();
		//代理对象与被代理对象实现了相同的接口
		//代理对象与被代理对象没有继承关系
		System.out.println(userServiceProxy);
		System.out.println(userServiceProxy instanceof UserServiceImpl);//false
	}
	
	@Test
	public void fun2(){
		UserServiceProxyFactory2 factory = new UserServiceProxyFactory2();
		UserService userServiceProxy = factory.getUserServiceProxy();
		userServiceProxy.insert();
		userServiceProxy.update();
		userServiceProxy.delete();
		userServiceProxy.select();
		//判断代理对象是否属于被代理对象类型
		//代理对象继承了被代理对象==>true
		System.out.println(userServiceProxy instanceof UserServiceImpl);//true
	}
}
