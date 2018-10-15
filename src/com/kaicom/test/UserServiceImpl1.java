package com.kaicom.test;

import org.springframework.stereotype.Service;

@Service(value = "userServiceImpl1")
public class UserServiceImpl1 implements UserService{

	public void insert() {
		System.out.println("UserServiceImpl1 insert");
		
	}

	public void delete() {
		System.out.println("UserServiceImpl1 delete");
		
	}

}
