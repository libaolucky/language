package com.hp.service;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.CustomerDao;
import com.hp.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService{
	//依赖注入
	@Autowired
	private CustomerDao customerDao;

	@Override
	public Customer login(String author, String password) {
		// TODO Auto-generated method stub
		Customer c=customerDao.selectByUp(author, password);
		return c;
	}

	@Override
	public int add(Customer customer) {
		// TODO Auto-generated method stub
		int c1=customerDao.insert(customer);
		return c1;
	}

	@Override
	public ArrayList<Customer> quan() {
		// TODO Auto-generated method stub
		ArrayList<Customer> c2=customerDao.selectAll();
		return c2;
	}
	
}
