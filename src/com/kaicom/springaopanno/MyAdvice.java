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

//֪ͨ��
@Aspect
@Component
public class MyAdvice {
	@Pointcut(value = "execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void pc(){};
	//ǰ��֪ͨ
	@Before("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void before(){
		System.out.println("����ǰ��֪ͨ");
	}
	//����֪ͨ����������쳣���ᱻ���ã�
	@AfterReturning("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void afterReturning(){
		System.out.println("���Ǻ���֪ͨ����������쳣���ᱻ���ã�");
	}
	//����֪ͨ
	@Around("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����֪֮ͨǰ�Ĳ���");
		Object proceed = pjp.proceed(); //����Ŀ�귽������
		System.out.println("����֪֮ͨ��Ĳ���");
		return proceed ;
	}
	@AfterThrowing("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	//�쳣����֪ͨ
	public void afterException(){
		System.out.println("�����ˣ������쳣��");
	}
	//����֪ͨ�������Ƿ�����쳣���ᱻ���ã�
	@After("execution(* com.kaicom.springaopanno.*ServiceImpl.*(..))")
	public void after(){
		System.out.println("���Ǻ���֪ͨ����������쳣�ᱻ���ã�");
	}
}
