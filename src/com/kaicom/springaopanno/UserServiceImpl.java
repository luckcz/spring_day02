package com.kaicom.springaopanno;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	public void insert() {
		System.out.println("新增了一个用户");
	}

	public void delete() {
		System.out.println("删除了一个用户");
	}

	public void update() {
		System.out.println("修改了一个用户");
	}

	public void select() {
		System.out.println("查询了一个用户");
	}

}
