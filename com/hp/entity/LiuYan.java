package com.hp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LiuYan {
	private Integer id;
	private String name;
	private String zhuti;
	private String content;
	 @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date time;
	
	 
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZhuti() {
		return zhuti;
	}
	public void setZhuti(String zhuti) {
		this.zhuti = zhuti;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public LiuYan(Integer id, String name, String zhuti, String content,
			Date time) {
		super();
		this.id = id;
		this.name = name;
		this.zhuti = zhuti;
		this.content = content;
		this.time = time;
	}
	public LiuYan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LiuYan [id=" + id + ", name=" + name + ", zhuti=" + zhuti
				+ ", content=" + content + ", time=" + time + "]";
	}
	
	

}
