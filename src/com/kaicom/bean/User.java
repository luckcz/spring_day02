package com.kaicom.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component(value = "user")
//@Service(value = "user")     service��
//@Controller(value = "user")  web��
//@Repository(value = "user")  dao��
//<bean name = "user" class = "com.kaicom.bean.user"/>
//ָ�������������Ĭ���ǵ�����singleton�� prototype����������֮��Ͳ����ˣ�������spring�������Ͳ����к�����������ڿ��ƣ���singleton��һֱ��spring�����б���������������
@Scope(scopeName="singleton")
public class User {
	@Value(value="tom")
	private String name ;
	private Integer age ;
	//@Autowired //�Զ�װ��
	//���⣺���ƥ��������һ�µĶ��󣬽��޷�ѡ�����ע����һ������
	//@Qualifier(value="car2")//ʹ��@Qualifierע�����spring�����Զ�װ���ĸ����ƶ���
	@Resource(name="car2") //�ֶ�ע�룬ָ��ע���ĸ����ƵĶ���
	private Car car ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@PostConstruct //�ڶ��󱻴�������ã� init-method
	public void init(){
		System.out.println("���ǳ�ʼ��������");
	}
	@PreDestroy //������֮ǰ���� destory-method
	public void destory(){
		System.out.println("�������ٷ�����");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
}
