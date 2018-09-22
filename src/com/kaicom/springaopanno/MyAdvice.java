package com.kaicom.springaopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//通知类
@Aspect
@Component
public class MyAdvice {
	@Pointcut(value = "execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void pc(){};
	//前置通知
	@Before("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void before(){
		System.out.println("这是前置通知");
	}
	//后置通知（如果出现异常不会被调用）
	@AfterReturning("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void afterReturning(){
		System.out.println("这是后置通知（如果出现异常不会被调用）");
	}
	//环绕通知
	@Around("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("环绕通知之前的部分");
		Object proceed = pjp.proceed(); //调用目标方法代码
		System.out.println("环绕通知之后的部分");
		return proceed ;
	}
	@AfterThrowing("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	//异常拦截通知
	public void afterException(){
		System.out.println("出事了！出现异常了");
	}
	//后置通知（无论是否出现异常都会被调用）
	@After("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void after(){
		System.out.println("这是后置通知（如果出现异常会被调用）");
	}
}
