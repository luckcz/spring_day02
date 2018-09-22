package com.kaicom.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//观光代码=>动态代理
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
		System.out.println("打开事物！！！");
		Object invoke = method.invoke(userService, args);
		System.out.println("提交事物！！！");
		return invoke;
	}
}
