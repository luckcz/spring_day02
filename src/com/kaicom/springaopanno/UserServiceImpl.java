package com.kaicom.springaopanno;

import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	public void insert() {
		System.out.println("������һ���û�");
	}

	public void delete() {
		System.out.println("ɾ����һ���û�");
	}

	public void update() {
		System.out.println("�޸���һ���û�");
	}

	public void select() {
		System.out.println("��ѯ��һ���û�");
	}

}
