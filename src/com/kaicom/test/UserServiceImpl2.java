package com.kaicom.test;

import org.springframework.stereotype.Service;

@Service("userServiceImpl2")
public class UserServiceImpl2 implements UserService {

	public void insert() {
		System.out.println("UserServiceImpl2 insert");
		
	}

	public void delete() {
		System.out.println("UserServiceImpl2 delete");
		
	}

}
