package com.multi.mini;

public class MemberVO {
	private String id;
	private String name;
	private String pw;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "memberVO [id=" + id + ", name=" + name + ", pw=" + pw + "]";
	}
	
	
}
