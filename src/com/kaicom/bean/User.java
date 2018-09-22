package com.kaicom.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component(value = "user")
//@Service(value = "user")     service层
//@Controller(value = "user")  web层
//@Repository(value = "user")  dao层
//<bean name = "user" class = "com.kaicom.bean.user"/>
//指定对象的作用域（默认是单例的singleton） prototype他创建对象之后就不管了，会脱离spring容器，就不会有后面的生命周期控制，而singleton会一直在spring容器中被管理，有生命周期
@Scope(scopeName="singleton")
public class User {
	@Value(value="tom")
	private String name ;
	private Integer age ;
	//@Autowired //自动装配
	//问题：如果匹配多个类型一致的对象，将无法选择具体注入哪一个对象
	//@Qualifier(value="car2")//使用@Qualifier注解告诉spring容器自动装配哪个名称对象
	@Resource(name="car2") //手动注入，指定注入哪个名称的对象
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
	@PostConstruct //在对象被创建后调用， init-method
	public void init(){
		System.out.println("我是初始化方法！");
	}
	@PreDestroy //在销毁之前调用 destory-method
	public void destory(){
		System.out.println("我是销毁方法！");
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
}
