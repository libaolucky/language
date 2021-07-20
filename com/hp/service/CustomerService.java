package com.hp.service;

import java.util.ArrayList;

import com.hp.entity.Customer;


public interface CustomerService {
	//登录
		Customer login(String author,String password);
		//注册
		int add(Customer customer);
		//全查
		ArrayList<Customer> quan();
	
}
