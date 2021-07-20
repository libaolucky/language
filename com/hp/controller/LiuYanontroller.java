package com.hp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hp.entity.LiuYan;
import com.hp.service.LiuYanService;

@Controller
@RequestMapping("/zz")
public class LiuYanontroller {
	@Autowired
	private LiuYanService liuYanService;
	
	@RequestMapping("/insert")
	public String insert(LiuYan liu){
		int a=liuYanService.tian(liu);
		if(a>0){
			System.out.println("添加成功！");
			return "redirect:/zz/quan";
		}else{
			System.out.println("添加失败！");
			return "index";

		}
		
	}
	
	@RequestMapping("/quan")
	public String quan(HttpSession session){
		ArrayList<LiuYan> li=liuYanService.Quan();
		//存到作用域里
		session.setAttribute("li", li);

		return "main";

	}
}
