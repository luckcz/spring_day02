package com.kaicom.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
//�۹����=>cglib����
public class UserServiceProxyFactory2 implements MethodInterceptor{
	public UserService getUserServiceProxy(){
		Enhancer en = new Enhancer(); // ���������ɴ������
		en.setSuperclass(UserServiceImpl.class); //���ö�˭���д���
		en.setCallback(this); //����Ҫ��ʲô
		UserService userService = (UserService)en.create();
		return userService ;
	}

	public Object intercept(Object proxyObj, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println("������!!!");
		Object invokeSuper = methodProxy.invokeSuper(proxyObj, arg2);
		System.out.println("�ύ�������");
		return invokeSuper;
	}
}
