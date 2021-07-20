package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.Customer;
import com.hp.service.CustomerService;


@Controller
@RequestMapping("/user")
public class Customercontroller {
     //依赖注入
	@Autowired
	private CustomerService customerService;
	
	 @RequestMapping("/login")
	  public String login(String author,String password,HttpSession session){
		  System.out.println(author+"---"+password);
		Customer su=customerService.login(author, password);
		//将获取到在对象存入到session作用域中
		session.setAttribute("su", su);
		  if(su != null){
			  System.out.println("登录成功");
			  return "redirect:/main.jsp";
		  }else{
			  System.out.println("登录失败");
		     return "redirect:/login.jsp";
		  }
	 }
	
	
	
	@RequestMapping("/insert")
	public String insert(Customer customer){
		int a=customerService.add(customer);
		if(a>0){
			System.out.println("注册成功");
			return "redirect:/login.jsp";
		}else{
			System.out.println("注册失败");
			return "index";

		}
		
	}
	@RequestMapping("/quan")
	public String quan(HttpSession session){
		ArrayList<Customer> aa=customerService.quan();
		session.setAttribute("aa", aa);

		return "main";
	}

}

