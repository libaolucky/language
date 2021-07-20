package com.hp.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer {
	private Integer id;
	private String author;
	private String password;
	private String ip;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date time;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", author=" + author + ", password="
				+ password + ", ip=" + ip + ", time=" + time + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer id, String author, String password, String ip,
			Date time) {
		super();
		this.id = id;
		this.author = author;
		this.password = password;
		this.ip = ip;
		this.time = time;
	}
	
	
}
