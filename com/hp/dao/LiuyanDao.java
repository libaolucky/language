package com.hp.dao;

import java.util.ArrayList;

import com.hp.entity.LiuYan;

public interface LiuyanDao {
  //Ìí¼Ó
	int insert(LiuYan liuyan);
	//È«²é
	ArrayList<LiuYan> selectAll();
}
