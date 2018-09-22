package com.kaicom.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//�۹����=>��̬����
public class UserServiceProxyFactory implements InvocationHandler{
	private UserService userService ;
	public UserServiceProxyFactory(UserService userService) {
		super();
		this.userService = userService;
	}

	public UserService getUserServiceProxy(){
		UserService userService = (UserService)Proxy.newProxyInstance(UserServiceProxyFactory.class.getClassLoader(),
				UserServiceImpl.class.getInterfaces(),
				this
				);
		return userService;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���������");
		Object invoke = method.invoke(userService, args);
		System.out.println("�ύ�������");
		return invoke;
	}
}
