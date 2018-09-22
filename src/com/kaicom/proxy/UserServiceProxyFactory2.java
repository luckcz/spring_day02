package com.kaicom.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
//观光代码=>cglib代理
public class UserServiceProxyFactory2 implements MethodInterceptor{
	public UserService getUserServiceProxy(){
		Enhancer en = new Enhancer(); // 帮我们生成代理对象
		en.setSuperclass(UserServiceImpl.class); //设置对谁进行代理
		en.setCallback(this); //代理要做什么
		UserService userService = (UserService)en.create();
		return userService ;
	}

	public Object intercept(Object proxyObj, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println("打开事物!!!");
		Object invokeSuper = methodProxy.invokeSuper(proxyObj, arg2);
		System.out.println("提交事物！！！");
		return invokeSuper;
	}
}
