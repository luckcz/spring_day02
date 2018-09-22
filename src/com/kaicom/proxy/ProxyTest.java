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
		//��������뱻�������ʵ������ͬ�Ľӿ�
		//��������뱻�������û�м̳й�ϵ
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
		//�жϴ�������Ƿ����ڱ������������
		//�������̳��˱��������==>true
		System.out.println(userServiceProxy instanceof UserServiceImpl);//true
	}
}
