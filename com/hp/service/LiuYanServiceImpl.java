package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.LiuyanDao;
import com.hp.entity.LiuYan;

@Service
public class LiuYanServiceImpl implements LiuYanService{
	//“¿¿µ◊¢»Î
	@Autowired
	private LiuyanDao liuyanDao;
	

	@Override
	public int tian(LiuYan liuyan) {
		// TODO Auto-generated method stub
		int i=liuyanDao.insert(liuyan);
		return i;
	}

	@Override
	public ArrayList<LiuYan> Quan() {
		// TODO Auto-generated method stub
		ArrayList<LiuYan> i1=liuyanDao.selectAll();
		return i1;
	}

}
