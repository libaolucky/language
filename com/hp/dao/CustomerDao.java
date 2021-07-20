package com.hp.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.hp.entity.Customer;

public interface CustomerDao {
	//登录
	Customer selectByUp(@Param("author")String author,@Param("password")String password);
	//注册
	int insert(Customer customer);
	//全查
		ArrayList<Customer> selectAll();
}
