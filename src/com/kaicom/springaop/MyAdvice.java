package com.kaicom.springaop;

import org.aspectj.lang.ProceedingJoinPoint;

//֪ͨ��
public class MyAdvice {
	//ǰ��֪ͨ
//		|-Ŀ�귽������֮ǰ����
	//����֪ͨ����������쳣���ᱻ���ã�
//		|-Ŀ�귽������֮�����
	//����֪ͨ
//		|-��Ŀ�귽��֮ǰ��֮�󶼵���
	//�쳣����֪ͨ
//		|-��������쳣�ͻᱻ����
	//����֪ͨ�������Ƿ�����쳣���ᱻ���ã�
//		|-��Ŀ�귽������֮�����
/*****************************************************************************************************/
	//ǰ��֪ͨ
	public void before(){
		System.out.println("����ǰ��֪ͨ");
	}
	//����֪ͨ����������쳣���ᱻ���ã�
	public void afterReturning(){
		System.out.println("���Ǻ���֪ͨ����������쳣���ᱻ���ã�");
	}
	//����֪ͨ
	public Object around(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("����֪֮ͨǰ�Ĳ���");
		Object proceed = pjp.proceed(); //����Ŀ�귽������
		System.out.println("����֪֮ͨ��Ĳ���");
		return proceed ;
	}
	//�쳣����֪ͨ
	public void afterException(){
		System.out.println("�����ˣ������쳣��");
	}
	//����֪ͨ�������Ƿ�����쳣���ᱻ���ã�
	public void after(){
		System.out.println("���Ǻ���֪ͨ����������쳣�ᱻ���ã�");
	}
}
