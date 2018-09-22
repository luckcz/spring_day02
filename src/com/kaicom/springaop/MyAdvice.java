package com.kaicom.springaop;

import org.aspectj.lang.ProceedingJoinPoint;

//通知类
public class MyAdvice {
	//前置通知
//		|-目标方法运行之前调用
	//后置通知（如果出现异常不会被调用）
//		|-目标方法运行之后调用
	//环绕通知
//		|-在目标方法之前和之后都调用
	//异常拦截通知
//		|-如果出现异常就会被调用
	//后置通知（无论是否出现异常都会被调用）
//		|-在目标方法运行之后调用
/*****************************************************************************************************/
	//前置通知
	public void before(){
		System.out.println("这是前置通知");
	}
	//后置通知（如果出现异常不会被调用）
	public void afterReturning(){
		System.out.println("这是后置通知（如果出现异常不会被调用）");
	}
	//环绕通知
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕通知之前的部分");
		Object proceed = pjp.proceed(); //调用目标方法代码
		System.out.println("环绕通知之后的部分");
		return proceed ;
	}
	//异常拦截通知
	public void afterException(){
		System.out.println("出事了！出现异常了");
	}
	//后置通知（无论是否出现异常都会被调用）
	public void after(){
		System.out.println("这是后置通知（如果出现异常会被调用）");
	}
}
